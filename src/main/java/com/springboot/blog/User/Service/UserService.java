package com.springboot.blog.User.Service;

import com.springboot.blog.User.Repository.RoleRepository;
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
    private final RoleRepository roleRepository;

    public UserVo save(UserVo userVo) {

        RoleVo roleVo = new RoleVo("ROLE_USER");
        roleRepository.save(roleVo);

        userVo.setRoles(Arrays.asList(roleVo));
        return userRepository.save(userVo);
    }


}
