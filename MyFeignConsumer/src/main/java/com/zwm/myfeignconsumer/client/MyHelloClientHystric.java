package com.zwm.myfeignconsumer.client;

import org.springframework.stereotype.Component;

@Component
public class MyHelloClientHystric implements MyHelloClient{
    @Override
    public String helloFromClient(String name) {
        return "sorry " + name;
    }
}
