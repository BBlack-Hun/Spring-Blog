package com.springboot.blog;

import com.springboot.blog.Post.Repository.PostRepository;
import com.springboot.blog.Post.VO.PostVO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PostRepository postRepository) {
        return args ->{
            PostVO postVO = new PostVO("title", "test", "test");

            postRepository.insert(postVO);
        };
    }

}
