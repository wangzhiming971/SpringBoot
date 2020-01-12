package com.dongfang.springboot.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest")
public class RestApiController {
    @RequestMapping(path = "/hello")
    public String hello() {
        System.out.println("this method is invoked");
        return "{\"message\": \"Hello World\"}";
    }
}
