package com.example.employeeui.controller;

import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Hi Thymleaf");
        return "home";
    }
}