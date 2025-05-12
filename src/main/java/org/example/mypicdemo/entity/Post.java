package org.example.mypicdemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Post{
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    private String imageUrl; //게시글 대표 이미지

    private String title;

    @Lob
    private String content;
}
