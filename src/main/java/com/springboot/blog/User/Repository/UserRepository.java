package com.springboot.blog.User.Repository;

import com.springboot.blog.User.VO.UserVo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserVo, String> {
}
