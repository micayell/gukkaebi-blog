package me.kimchangju.blog.service;

import lombok.RequiredArgsConstructor;
import me.kimchangju.blog.domain.Article;
import me.kimchangju.blog.dto.AddArticleRequest;
import me.kimchangju.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@RequiredArgsConstructor
// 빈으로 등록
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 블로그 글 목록 조회 메서드
    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
