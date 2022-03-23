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


    // 최초 실행시킬때, 관리자 계정을 생성할때 아래의 bean을 이용하여 계정을 생성한다. -> MongoRepository 로는 제한되니, MongoTemplate을 같이 사용함.
//    @Bean
//    CommandLineRunner runner(PostRepository postRepository) {
//        return args ->{
//            PostVO postVO = new PostVO("title", "test", "test");
//
//            postRepository.insert(postVO);
//        };
//
}