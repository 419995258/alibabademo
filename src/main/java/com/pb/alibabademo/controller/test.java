package com.pb.alibabademo.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Validated
@RestController
@RequestMapping("/api/test")
@Slf4j
public class test {
}
