package com.gentech.demo.details;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController1 {

    @GetMapping("/msg1")
    public String getMessage1()
    {
        return "Welcome to Same Bean Class Explanation!!!";
    }
}
