package com.springboot.blog.User.Controller;

import com.springboot.blog.User.Service.UserService;
import com.springboot.blog.User.Vo.UserRoleVO;
import com.springboot.blog.User.Vo.UserTokenVO;
import com.springboot.blog.User.Vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UesrController {

    private final UserService userService;

    @PostMapping()
    public String register(@RequestBody UserVO userVO) {
        boolean isValidEmail = userService.test(userVO.getEmail());

        if(!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        return userService.signUpUser(new UserVO(
                userVO.getUsername(),
                userVO.getNickname(),
                userVO.getEmail(),
                userVO.getPassword(),
                UserRoleVO.USER
        ));
    }

    @Transactional
    public String confirmToken(String token) {
        UserTokenVO userToken = userService
                .getToken(token)
                .orElseThrow(()-> new IllegalStateException("token not found"));

        if (userToken.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiredAt = userToken.getExpiredAt();

        if (expiredAt.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("token expired");
        }

        userService.setConfirmedAt(token);
        userService.enableUser(
            userToken.getUserVO().getEmail()
        );

        return "confirmed";
    }


}
