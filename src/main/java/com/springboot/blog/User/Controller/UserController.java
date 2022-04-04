package com.springboot.blog.User.Controller;

import com.springboot.blog.User.Service.UserService;
import com.springboot.blog.User.VO.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ModelAttribute("user")
    public UserVo userVo() {
        return new UserVo();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "User/registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserVo userVo) {
        userService.save(userVo);

        return "redirect:/registration?success";
    }

}
