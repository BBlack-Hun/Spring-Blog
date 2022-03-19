package com.springboot.blog.Post.Controller;


import com.springboot.blog.Post.Service.PostService;
import com.springboot.blog.Post.VO.PostVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
public class PostController {

    private final PostService postService;


    @PostMapping
    public ResponseEntity<PostVO> createPost(@RequestBody PostVO paramVO) {
        return postService.createPost(paramVO);
    }

}

