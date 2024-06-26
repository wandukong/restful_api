package kr.re.kitri.myblog.service;

import kr.re.kitri.myblog.model.Article;
import kr.re.kitri.myblog.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Iterable<Article> getArticleList() {
        return articleRepository.findAll();
    }

    public Optional<Article> getArticleById(long id) {
        return articleRepository.findById(id);
    }

    public Article registerArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article modifyArticle(Article article) {
        return articleRepository.save(article);
    }

    public void removeArticle(long id) {
        articleRepository.deleteById(id);
    }
}
