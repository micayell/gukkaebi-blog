package me.kimchangju.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.kimchangju.blog.domain.Article;

// 기본 생성자 추가
@NoArgsConstructor
// 모든 필드 값을 파라미터로 받는 생성자 추가
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    // 생성자를 사용해 객체 생성
    public Article toEntity() {
        return Article.builder().title(title).content(content).build();
    }
}
