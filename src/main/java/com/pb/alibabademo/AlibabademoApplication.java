package com.pb.alibabademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabademoApplication.class, args);
    }

}
