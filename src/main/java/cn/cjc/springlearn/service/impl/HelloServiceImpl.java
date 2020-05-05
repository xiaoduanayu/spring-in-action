package cn.cjc.springlearn.service.impl;

import cn.cjc.springlearn.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author debo
 * @date 2020-04-28
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println(String.format("Hello, %s", name));
    }
}
