package com.springboot.blog.User.VO;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
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
    private Collection<RoleVo> roles;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedDate
    private LocalDateTime updatedAt = LocalDateTime.now();

}
