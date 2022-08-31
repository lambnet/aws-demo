package com.nandosan.tekno.learnawspipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class OrderController {

    @GetMapping("/hello2")
    public String hello(){
        return "Hello Dwiki";
    }
}
