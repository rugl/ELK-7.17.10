package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Log4j2
// @Slf4j
public class TestController {

    @GetMapping(value = "test")
    public void getTest(){
        log.info("go into test page");
        System.err.println("go into test page");
    }
}
