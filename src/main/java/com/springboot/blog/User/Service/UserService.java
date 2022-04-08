package com.springboot.blog.User.Service;

import com.springboot.blog.User.Vo.UserTokenVO;
import com.springboot.blog.User.Vo.UserVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String email);

    String signUpUser(UserVO userVO);


    String register(UserVO userVO);


    boolean test(String email);

    void saveToken(UserTokenVO userTokenVO);

    Optional<UserTokenVO> getToken(String token);

    void setConfirmedAt(String token);

    void enableUser(String email);
}
