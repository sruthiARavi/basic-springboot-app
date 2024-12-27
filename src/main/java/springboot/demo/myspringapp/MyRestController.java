package com.springboot.demo.myspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //Expose the "/" end point that simply returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
