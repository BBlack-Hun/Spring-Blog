package com.springboot.blog.User.Service;

import com.springboot.blog.User.Repository.UserRepository;
import com.springboot.blog.User.VO.RoleVo;
import com.springboot.blog.User.VO.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserVo save(UserVo userVo) {

        userVo.setRoles(Arrays.asList(new RoleVo("ROLE_USER")));
        return userRepository.save(userVo);
    }


}
