package com.example.first_spring_project.repository;

import com.example.first_spring_project.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
