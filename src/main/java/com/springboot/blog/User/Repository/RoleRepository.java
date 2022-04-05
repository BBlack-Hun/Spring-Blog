package com.springboot.blog.User.Repository;

import com.springboot.blog.User.VO.RoleVo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<RoleVo, String> {
}
