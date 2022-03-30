package com.springboot.blog.Employee.Controller;

import com.springboot.blog.Employee.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {

        return "Employee/emplyees";
    }
}
