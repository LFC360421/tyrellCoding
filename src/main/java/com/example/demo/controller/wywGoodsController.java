package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wywGoodsController {
     @PostMapping("/reg")
     public  String wyw(){
          System.out.println("11");
          return null;
     }
}