package com.springboot.blog.Post.Service;

import com.springboot.blog.Post.Repository.PostRepository;
import com.springboot.blog.Post.VO.ParamVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public ResponseEntity<ParamVO> createPost(ParamVO paramVO) {

        postRepository.save(paramVO);

        return null;
    }

}
