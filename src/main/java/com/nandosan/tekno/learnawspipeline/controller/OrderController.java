package com.nandosan.tekno.learnawspipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-alvian")
public class OrderController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Dwiki";
    }
}
