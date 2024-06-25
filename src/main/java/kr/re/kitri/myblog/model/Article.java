package kr.re.kitri.myblog.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Article {
    private long id;
    private String title;
    private String content;
    private String views;
}
