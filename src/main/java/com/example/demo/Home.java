package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

   public class Home {
    @GetMapping("/xafa")
    public String hello() {
        return "Humoyun";
    }
    @GetMapping("/xabar")
    public String String1(){
       return "Sharifjonov";
    }
}
