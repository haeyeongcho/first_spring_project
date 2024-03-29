package com.example.first_spring_project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // DB가 해당 객체를 인식 가능! (해당 클래스로 테이블을 만든다!)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Article {
    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id를 자동 생성 어노테이션!
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public void patch(Article article) {
        if (article.title != null) {
            this.title = article.title;
        }
        if (article.content != null) {
            this.content = article.content;
        }
    }
}