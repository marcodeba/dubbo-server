package com.gupaoedu.dubbo;

public class GpHelloImpl2 implements IGpHello {
    @Override
    public String sayHello(String msg) {
        return "Hello version 2 " + msg;
    }
}
