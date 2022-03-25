package com.springboot.blog;

import com.springboot.blog.Post.Repository.PostRepository;
import com.springboot.blog.Post.VO.PostVO;
import com.springboot.blog.student.Repository.StudentRepository;
import com.springboot.blog.student.Vo.StudnetVO;
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
//    CommandLineRunner runner(StudentRepository studentRepository) {
//        return args -> {
//            StudnetVO studnet1 = new StudnetVO("Ramesh", "Fadatare", "ramesh@mgmail.com");
//
//            studentRepository.insert(studnet1);
//
//            StudnetVO studnet2 = new StudnetVO("Sanjay", "Jadhav", "sanjay@mgmail.com");
//
//            studentRepository.insert(studnet2);
//
//            StudnetVO studnet3 = new StudnetVO("Tony", "stark", "tony@mgmail.com");
//
//            studentRepository.insert(studnet3);
//        };
//    }


}