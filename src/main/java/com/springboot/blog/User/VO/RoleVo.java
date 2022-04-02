package com.springboot.blog.User.VO;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "role")
public class RoleVo {

    @Id
    private String id;
    private String name;

    public RoleVo(String name) {
        this.name = name;
    }
}
