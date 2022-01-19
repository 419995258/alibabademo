package com.pb.alibabademo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Validated
@RestController
@RequestMapping("/api/test")
@Slf4j
@RefreshScope
public class test {


    @Value("${test:ttt}")
    private String test;

    @GetMapping("/test")
    public String test() {
        System.out.println("example");
        return test;
    }
}
