package com.springboot.student.Controller;

import com.springboot.student.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //handler method to handle list student and return mode and view
    @GetMapping(value = "/students")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudents());

        return "Student/students";
    }


}
