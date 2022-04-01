package com.springboot.blog.User.Repository;

import com.springboot.blog.User.VO.UserVo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserVo, String> {
}
