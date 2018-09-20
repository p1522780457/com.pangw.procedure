package com.dubbo.test;

import com.dubbo.service.DubboServicer;

/**
 * @Auther: pangw
 * @Date: 2018/9/20 15:36
 * @Description:
 */
public class MyDubboServicerImpl implements DubboServicer {

    @Override
    public String showMsg() {
        return "这是我的第一个dubbo程序";
    }
}
