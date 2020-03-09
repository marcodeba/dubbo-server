package com.gupaoedu.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;

public class GpHelloImpl2 implements IGpHello {
    @Override
    public String sayHello(String msg) {
        return "Hello version 2 " + msg + "Request from consumer :" + RpcContext.getContext().getRemoteAddress();
    }
}
