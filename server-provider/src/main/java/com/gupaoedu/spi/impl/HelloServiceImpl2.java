package com.gupaoedu.spi.impl;

import com.gupaoedu.spi.IHelloService;

public class HelloServiceImpl2 implements IHelloService {
    @Override
    public String sayHello() {
        return "HelloServiceImpl2 say Hello";
    }
}
