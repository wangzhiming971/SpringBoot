package com.dongfang.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "/rest")
public class RestApiController {
    private static final  Logger LOGGER = LoggerFactory.getLogger(RestApiController.class);


    @RequestMapping(path = "/hello")
    public String hello() {
        LOGGER.info("logger class " + LOGGER.getClass());
        LOGGER.info("this is log");
        return "{\"message\": \"Hello World\"}";
    }
}
