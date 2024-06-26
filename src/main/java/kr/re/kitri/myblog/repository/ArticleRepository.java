package kr.re.kitri.myblog.repository;

import kr.re.kitri.myblog.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article, Long> {

//    @Modifying
//    @Query("update article set views = views + 1 where id = :id")
//    void increaseViewCount(long id);


    @Modifying
    //@Query("update Article a set a.views = a.views + 1 where a.id = :id")
    @Query(value = "update article set views = views + 1 where id = :id", nativeQuery = true)
    void increaseViewCount(long id);
}
