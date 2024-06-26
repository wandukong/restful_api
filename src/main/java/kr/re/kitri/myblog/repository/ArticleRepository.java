package kr.re.kitri.myblog.repository;

import kr.re.kitri.myblog.model.Article;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Modifying
    @Query("update article set views = views + 1 where id = :id")
    void increaseViewCount(long id);
}
