package com.archive.exam.service;

import com.archive.exam.domain.ExamRepository;
import com.archive.exam.dto.ExamDto;
import com.archive.exam.dto.ExamListItemDto;
import com.archive.exam.model.Exam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamService {
    private final ExamRepository repository;

    public ExamDto getExam(Long id){
        Exam exam = repository.getReferenceById(id);
        return ExamDto.toDto(exam);
    }

    public List<ExamListItemDto> getExamList(String category){
        List<Exam> examList = repository.findAllByCategory(category);

        return examList.stream()
                .map(ExamListItemDto::toDto)
                .toList();
    }
}
