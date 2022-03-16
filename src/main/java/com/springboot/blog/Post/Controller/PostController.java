package com.springboot.blog.Post.Controller;

import com.springboot.blog.Post.Repository.PostRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostController {


    private final PostRepository postRepository;

}

