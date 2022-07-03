package com.zwm.myeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return "hi " + name + ", i am from port: " + port;
    }
}
