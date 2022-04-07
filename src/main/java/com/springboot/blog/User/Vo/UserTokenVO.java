package com.springboot.blog.User.Vo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDateTime;

@Data
@Document(collection = "token")
public class UserTokenVO {

    @Id
    private String id;
    private String token;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime expiredAt = LocalDateTime.now().plusMinutes(15);
    private LocalDateTime confirmedAt;

    @DBRef
    private UserVO userVO;

    public UserTokenVO(String token, UserVO userVO) {
        this.token = token;
        this.userVO = userVO;
    }
}
