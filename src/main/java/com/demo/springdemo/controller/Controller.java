package com.demo.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/test-get")
    public String getData() {
        return "This is a sample output from the '/test-get' endpoint";
    }
}
