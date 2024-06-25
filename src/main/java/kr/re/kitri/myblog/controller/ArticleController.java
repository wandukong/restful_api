package kr.re.kitri.myblog.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    @GetMapping("/api/articles")
    public String getArticles() {
        return "All Articles";
    }

    //@PostMapping("/api/articles")

    @GetMapping("/api/articles/{id}")
    public String detailArticle(@PathVariable String id) {
        return id + " Detail Article";
    }

    //@PutMapping("/api/articles")

    //@DeleteMapping("api/articles/{id}")
}
