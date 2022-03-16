package com.springboot.blog.Post.VO;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collation = "Post")
public class ParamVO {

    @Id
    private String id;

    private String title;
    private String description;
    private String content;
}