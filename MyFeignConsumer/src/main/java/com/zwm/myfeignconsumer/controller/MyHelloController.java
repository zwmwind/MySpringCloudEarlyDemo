package com.zwm.myfeignconsumer.controller;

import com.zwm.myfeignconsumer.client.MyHelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHelloController {

    @Autowired
    private MyHelloClient myHelloClient;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {

        return myHelloClient.helloFromClient(name);
    }
}
