package com.springboot.blog.Post.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document(collation = "Post")
public class PostVO {

    @Id
    private String id;

    private String title;
    private String description;
    private String content;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedDate
    private LocalDateTime updatedAt = LocalDateTime.now();

    public PostVO(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }
}
