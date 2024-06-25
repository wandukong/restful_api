package kr.re.kitri.myblog.service;

import kr.re.kitri.myblog.model.Article;
import kr.re.kitri.myblog.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getArticleList() {
        return articleRepository.selectAllArticles();
    }

    public Article getArticleById(long id) {
        return articleRepository.selectArticleById(id);
    }

    public Article registerArticle(Article article) {
        return articleRepository.insertArticle(article);
    }


    public Article modifyArticle(Article article) {
        return articleRepository.updateArticle(article);
    }

    public void removeArticle(long id) {
        articleRepository.deleteArticle(id);
    }
}
