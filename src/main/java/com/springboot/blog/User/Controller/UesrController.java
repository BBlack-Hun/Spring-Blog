package com.springboot.blog.User.Controller;

import com.springboot.blog.User.Service.UserService;
import com.springboot.blog.User.Vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UesrController {

    private final UserService userService;

    @PostMapping("/")
    public String register(@RequestBody UserVO userVO) {
        System.out.println(userVO);
        return userService.register(userVO);
    }
}
