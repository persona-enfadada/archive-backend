package com.archive.exam.dto;

import com.archive.exam.model.Exam;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExamListItemDto {
    Long id;
    String title;
    String type;

    public static ExamListItemDto toDto(Exam exam){
        return ExamListItemDto.builder()
                .id(exam.getId())
                .title(exam.getTitle())
                .type(exam.getType())
                .build();
    }
}
