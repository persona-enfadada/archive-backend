package com.archive.exam.controller;

import com.archive.exam.dto.ExamDto;
import com.archive.exam.dto.ExamListItemDto;
import com.archive.exam.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("exam")
public class ExamController {
    private final ExamService examService;
    @PostMapping("/detail/{id}")
    public ResponseEntity<?> getExam(@PathVariable Long id){
        ExamDto exam = examService.getExam(id);
        return ResponseEntity.ok().body(exam);
    }

    @PostMapping("/{category}")
    public ResponseEntity<?> getFileList(@PathVariable String category){
        List<ExamListItemDto> examList = examService.getExamList(category);
        System.out.println(category);
        return ResponseEntity.ok().body(examList);
    }
}
