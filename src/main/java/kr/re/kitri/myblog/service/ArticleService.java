package kr.re.kitri.myblog.service;

import kr.re.kitri.myblog.model.Article;
import kr.re.kitri.myblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getArticleList() {
        return articleRepository.selectAllArticles();
    }

    public Article getArticleById(long id) {
        return articleRepository.selectArticleById(id);
    }
}
