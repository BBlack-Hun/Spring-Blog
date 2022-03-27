package com.springboot.blog.student.Controller;

import com.springboot.blog.student.Service.StudentService;
import com.springboot.blog.student.Vo.StudnetVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        return "redirect:/students";
    }

    @GetMapping(value = "/students/edit/{id}")
    public String editStudentForm(@PathVariable String id, Model model) {
        model.addAttribute("student", studentService.getOneStudent(id));

        return "Student/edit_student";
    }

    @PostMapping(value = "/students/{id}")
    public String updateStudent(@PathVariable String id, @ModelAttribute("student") StudnetVO studnetVO, Model model) {
        // get Student from database by id
        StudnetVO existingStudent = studentService.getOneStudent(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(studnetVO.getFirstName());
        existingStudent.setLastName(studnetVO.getLastName());
        existingStudent.setEmail(studnetVO.getEmail());

        // save updated Student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";

    }


}
