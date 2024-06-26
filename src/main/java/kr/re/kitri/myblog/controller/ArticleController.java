package kr.re.kitri.myblog.controller;

import kr.re.kitri.myblog.model.Article;
import kr.re.kitri.myblog.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;     // Dependency Injection

    @GetMapping("/api/articles")
    public ResponseEntity<Iterable<Article>> getArticles() {
        return ResponseEntity.ok().body(articleService.getArticleList());
    }

    @GetMapping("/api/articles/{id}")
    public ResponseEntity<Optional<Article>> detailArticle(@PathVariable long id) {
        return ResponseEntity.ok().body(articleService.getArticleById(id));
    }

    @PostMapping("/api/articles")
    public ResponseEntity<Article> registerArticle(@RequestBody Article article) {
        return ResponseEntity.status(HttpStatus.CREATED).body(articleService.registerArticle(article));
    }

    @PutMapping("/api/articles")
    public ResponseEntity<Article> modifyArticle(@RequestBody Article article) {
        return ResponseEntity.ok().body(articleService.modifyArticle(article));
    }

    @DeleteMapping("api/articles/{id}")
    public ResponseEntity<Void> removeArticle(@PathVariable long id) {
        articleService.removeArticle(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
