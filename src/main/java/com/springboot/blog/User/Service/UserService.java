package com.springboot.blog.User.Service;

import com.springboot.blog.User.Repository.UserRepository;
import com.springboot.blog.User.VO.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserVo save(UserVo userVo) {
        return userRepository.save(userVo);
    }


}
