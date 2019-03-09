package com.sxt.ytwl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloservlet {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
