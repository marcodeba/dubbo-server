package com.gupaoedu.spi.impl;

import com.gupaoedu.spi.IHelloService;

public class HelloServiceImpl1 implements IHelloService {
    @Override
    public String sayHello() {
        return "HelloServiceImpl1 say Hello";
    }
}
