package com.archive.exam.dto;

import com.archive.exam.model.Exam;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExamDto {
    private String category;
    private String title;
    private String imgUrl;

    public static ExamDto toDto(Exam entity){
        return ExamDto.builder()
                .category(entity.getCategory())
                .title(entity.getTitle())
                .imgUrl(entity.getImgUrl())
                .build();
    }

}
