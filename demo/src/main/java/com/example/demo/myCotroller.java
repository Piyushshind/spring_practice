package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class myCotroller {
    @RequestMapping("ps")
    public static String myMethod() {
        return "hello piyush ";
    }

    @PostMapping("formData")
    public static String getData(@RequestParam int num1, @RequestParam int num2) {
        int res = num1 + num2;
        return "Result is :- " + res;
    }
}
