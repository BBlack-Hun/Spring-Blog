package com.springboot.blog.User.Repository;

import com.springboot.blog.User.Vo.UserVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends MongoRepository<UserVO, String> {

    Optional<UserVO> findByEmail(String email);


}
