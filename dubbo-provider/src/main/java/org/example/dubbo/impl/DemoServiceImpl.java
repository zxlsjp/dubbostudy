package org.example.dubbo.impl;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.dubbo.api.invoker.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@DubboService
public class DemoServiceImpl  implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: " );
        return "Hello " + name;
    }
}
