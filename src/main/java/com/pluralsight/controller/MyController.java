package com.pluralsight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/my/hello")
    public String hello() {
        return "Hello";
    }
}
