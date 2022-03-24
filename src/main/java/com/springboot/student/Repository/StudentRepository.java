package com.springboot.student.Repository;

import com.springboot.student.Vo.StudnetVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudnetVO, String> {
}
