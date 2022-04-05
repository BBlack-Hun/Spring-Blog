package com.springboot.blog.User.VO;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Document(collection = "user")
public class UserVo {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    // 유니크한 인덱스 선언
    @Indexed(unique = true)
    private String email;
    private String password;
    @DBRef
    private Collection<RoleVo> roles;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedDate
    private LocalDateTime updatedAt = LocalDateTime.now();

    public UserVo(){}

    public UserVo(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
