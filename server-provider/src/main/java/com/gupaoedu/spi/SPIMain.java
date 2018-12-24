package com.gupaoedu.spi;

import java.util.ServiceLoader;

public class SPIMain {
    public static void main(String[] args) {
        ServiceLoader<IHelloService> loaders =
                ServiceLoader.load(IHelloService.class);

        for (IHelloService in : loaders) {
            System.out.println(in.sayHello());
        }
    }
}
