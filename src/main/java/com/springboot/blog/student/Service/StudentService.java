package com.springboot.blog.student.Service;

import com.springboot.blog.student.Repository.StudentRepository;
import com.springboot.blog.student.Vo.StudnetVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudnetVO> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudnetVO saveStudent(StudnetVO studnetVO) {
        return studentRepository.save(studnetVO);
    }

}
