package com.gupaoedu.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;

public class GpHelloImpl implements IGpHello {

    @Override
    public String sayHello(String msg) {
        return "Hello:" + msg + ", Request from consumer :" + RpcContext.getContext().getRemoteAddress();
    }
}
