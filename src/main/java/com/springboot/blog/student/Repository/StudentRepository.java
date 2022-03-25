package com.springboot.blog.student.Repository;

import com.springboot.blog.student.Vo.StudnetVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudnetVO, String> {
}
