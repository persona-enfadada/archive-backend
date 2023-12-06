package com.archive.exam.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "category")
    private String category;
    @Column(name = "type")
    private String type;

    private String title;
    private String imgUrl;
    public void setId(Long id) {
        this.id = id;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
