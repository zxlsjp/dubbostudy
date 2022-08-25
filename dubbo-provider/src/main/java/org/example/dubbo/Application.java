package org.example.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.example.dubbo.api.invoker.DemoService;
import org.example.dubbo.impl.DemoServiceImpl;
import org.example.dubbo.impl.EmbeddedZooKeeper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

@DubboComponentScan({"org.example.dubbo"})
@EnableDubbo
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {


        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(Application.class, args);
        System.out.println("dubbo service started");

//        System.setProperty("java.net.preferIPv4Stack", "true");
//        ServiceConfig<DemoService> service = new ServiceConfig<>();
//        service.setApplication(new ApplicationConfig("first-dubbo-provider"));
//        service.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
//        service.setInterface(DemoService.class);
//        service.setRef(new DemoServiceImpl());
//        service.export();
//        System.out.println("first-dubbo-provider is running.");
//        System.in.read();
    }


}
