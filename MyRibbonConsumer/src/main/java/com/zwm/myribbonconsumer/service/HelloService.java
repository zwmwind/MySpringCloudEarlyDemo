package com.zwm.myribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return restTemplate.getForObject("http://My-Client/hello?name=" + name , String.class);
    }

    public String helloError(String name) {
        return "hello, " + name + ", sorry, error!";
    }
}
