package com.springboot.student.Service;

import com.springboot.student.Repository.StudentRepository;
import com.springboot.student.Vo.StudnetVO;
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

}
