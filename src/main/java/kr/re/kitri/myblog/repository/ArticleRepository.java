package kr.re.kitri.myblog.repository;

import kr.re.kitri.myblog.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {

    public List<Article> selectAllArticles() {

        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1,"첫글", "반가워요", 0));
        articles.add(new Article(2,"두번째 글", "하이", 25));
        articles.add(new Article(3,"세번째 글", "ㅈㄱㄴ", 32));
        articles.add(new Article(4,"네번째 글", "ㅎㅎㅎㅎㅎ", 74));
        articles.add(new Article());

        return articles;
    }

    public Article selectArticleById(long id) {
        return new Article(id,"상세보기", "가나다라마", 33);
    }

    public void insertArticle(Article article) {
        System.out.println("article = " + article);
    }
}
