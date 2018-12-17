package com.example.employeeui.controller;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Log4j2
public class GreetingController {

    @GetMapping("/")
    public String greeting(Model model) {
        log.info("Employee UI");
        model.addAttribute("message", "Welcome");
        return "index";
    }



}