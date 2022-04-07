package com.springboot.blog.User.Service;

import com.springboot.blog.User.Vo.UserVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String email);


    String register(UserVO userVO);


}
