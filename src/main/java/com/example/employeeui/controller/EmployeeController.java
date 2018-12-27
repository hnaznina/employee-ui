package com.example.employeeui.controller;

import com.example.employeeui.service.EmployeeService;
import com.example.employeeui.vo.Employee;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Log4j2
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Hi Thymleaf");
        model.addAttribute("employees", employeeService.getAllEmployee());
        model.addAttribute("employee", new Employee());
        return "home";
    }

    @GetMapping("/employee/delete/{id}")
    public String homePage(@PathVariable Long id, Model model) {
        model.addAttribute("message", "Hi Thymleaf");
        model.addAttribute("employees", employeeService.deleteEmployee(id));
        return "redirect:/";
    }

    @PostMapping("/addemployee")
    public String insertEmployee(@Valid Employee employee, Model model) {
//        if(result.hasErrors()) {
//            return "home";
//        }
            log.info("Employee from html input: " + employee);
            employeeService.insertEmployee(employee);

            return "redirect:/";

    }

    @PutMapping("/employee/edit/{id}")
    public String editEmployee(@Valid Employee employee, Model model) {
//        if(result.hasErrors()) {
//            return "home";
//        }
        log.info("Employee from html input: " + employee);
        employeeService.updateEmployee(employee);

        return "redirect:/";

    }
}