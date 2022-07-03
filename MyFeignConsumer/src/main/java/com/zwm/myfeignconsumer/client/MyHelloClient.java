package com.zwm.myfeignconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "My-Client", fallback = MyHelloClientHystric.class)
public interface MyHelloClient {

     @GetMapping("/hello")
     String helloFromClient(@RequestParam("name") String name);
}
