package com.example.be;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Code {
    @GetMapping("/")
    public String getString(){
        System.out.println("from there");
        return "abc";
    }
}
