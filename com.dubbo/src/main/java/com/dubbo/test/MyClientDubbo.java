package com.dubbo.test;

import com.dubbo.service.DubboServicer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: pangw
 * @Date: 2018/9/20 15:50
 * @Description:
 */
public class MyClientDubbo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        DubboServicer servicer = (DubboServicer) applicationContext.getBean("dubboService");
        System.out.println(servicer.showMsg());
    }
}
