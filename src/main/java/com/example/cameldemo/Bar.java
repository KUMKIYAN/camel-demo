package com.example.cameldemo;

import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

@Component
public class Bar {
    @Handler
    public String doSomething() {
        System.out.println("hello......");
        return "Bye World";
    }
}