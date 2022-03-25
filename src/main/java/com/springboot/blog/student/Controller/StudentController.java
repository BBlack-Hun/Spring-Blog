package com.springboot.blog.student.Controller;

import com.springboot.blog.student.Service.StudentService;
import com.springboot.blog.student.Vo.StudnetVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @GetMapping(value = "/students/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        StudnetVO studnetVO = new StudnetVO();

        model.addAttribute("student", studnetVO);
        return "Student/create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") StudnetVO studnetVO) {
        studentService.saveStudent(studnetVO);

        return "redirect: Student/students";
    }


}
