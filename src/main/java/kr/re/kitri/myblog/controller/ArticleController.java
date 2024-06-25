package kr.re.kitri.myblog.controller;

import kr.re.kitri.myblog.model.Article;
import kr.re.kitri.myblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired // Dependency Injection
    private ArticleService articleService;

    @GetMapping("/api/articles")
    public List<Article> getArticles() {
        return articleService.getArticleList();
    }

    //@PostMapping("/api/articles")

    @GetMapping("/api/articles/{id}")
    public Article detailArticle(@PathVariable long id) {
        return articleService.getArticleById(id);
    }

    //@PutMapping("/api/articles")

    //@DeleteMapping("api/articles/{id}")
}
