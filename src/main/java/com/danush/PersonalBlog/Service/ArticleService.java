package com.danush.PersonalBlog.Service;

import com.danush.PersonalBlog.Entity.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    Article saveArticle(Article article);

    List<Article> getAllArticles();

    Optional<Article> getArticleById(Long id);

    Article createArticle(Article article);

    Article updateArticle(Long id, Article articleDetails);

    void deleteArticle(Long id);
}
