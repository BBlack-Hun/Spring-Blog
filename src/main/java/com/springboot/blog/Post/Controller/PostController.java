package com.springboot.blog.Post.Controller;

import com.springboot.blog.Post.Repository.PostRepositoryImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostController {

    private final PostRepositoryImpl postRepositoryImpl;



}

