package com.springboot.blog.User.Repository;

import com.springboot.blog.User.Vo.UserTokenVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface TokenRepository extends MongoRepository<UserTokenVO, String> {

    Optional<UserTokenVO> findByToken(String token);
}
