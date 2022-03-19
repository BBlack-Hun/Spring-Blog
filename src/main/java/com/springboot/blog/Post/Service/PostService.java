package com.springboot.blog.Post.Service;

import com.springboot.blog.Post.Repository.PostRepository;
import com.springboot.blog.Post.VO.PostVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public ResponseEntity<PostVO> createPost(PostVO paramVO) {

        postRepository.save(paramVO);

        return null;
    }

}
