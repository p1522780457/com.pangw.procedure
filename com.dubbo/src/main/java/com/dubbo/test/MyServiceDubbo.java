package com.dubbo.test;

import com.dubbo.service.DubboServicer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Auther: pangw
 * @Date: 2018/9/20 15:50
 * @Description:
 */
public class MyServiceDubbo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-service.xml");
        DubboServicer servicer = applicationContext.getBean(DubboServicer.class);
        System.out.println(servicer==null? "没开启服务":"开启服务");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
