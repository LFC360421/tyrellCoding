package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SyController {
    @PostMapping("/reg")
    public  String lfc(){
        System.out.println("11");
        return null;
    }
}
