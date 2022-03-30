package com.springboot.blog.Employee.Vo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "employee")
public class EmployeeVO {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String eamil;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedDate
    private LocalDateTime updatedAt = LocalDateTime.now();
}
