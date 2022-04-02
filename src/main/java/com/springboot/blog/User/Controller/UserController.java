package com.springboot.blog.User.Controller;

import com.springboot.blog.User.Service.UserService;
import com.springboot.blog.User.VO.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    public String registerUserAccount(@ModelAttribute("user")UserVo userVo) {
        userService.save(userVo);

        return "redirect:/registration?success";
    }

}
