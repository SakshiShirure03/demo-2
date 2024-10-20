package com.example.demo_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mlops {
    @GetMapping("/mlops")
    public String getData() {return  "Welcome to mlops Class learn more and more" ; }
}
