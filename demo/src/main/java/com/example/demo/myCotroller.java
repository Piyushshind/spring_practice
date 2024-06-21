package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class myCotroller {
    @RequestMapping("ps")

    public static String myMethod() {
        return "hello piyush ";
    }
}
