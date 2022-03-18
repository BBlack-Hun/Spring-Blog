package com.springboot.blog.Post.Repository;

import com.springboot.blog.Post.VO.ParamVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<ParamVO, String> {
}
