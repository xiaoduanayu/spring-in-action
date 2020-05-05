package cn.cjc.springlearn.service.impl;

import cn.cjc.springlearn.service.HelloService;

/**
 * @author debo
 * @date 2020-04-28
 */
public class HelloService1Impl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println(String.format("Hello, %s", name));
    }
}
