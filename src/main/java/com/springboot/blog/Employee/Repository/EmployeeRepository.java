package com.springboot.blog.Employee.Repository;

import com.springboot.blog.Employee.Vo.EmployeeVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeVO, String> {
}
