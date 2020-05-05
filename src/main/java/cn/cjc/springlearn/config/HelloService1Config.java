package cn.cjc.springlearn.config;

import cn.cjc.springlearn.condition.MagicExistCondition;
import cn.cjc.springlearn.service.HelloService;
import cn.cjc.springlearn.service.impl.HelloService1Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author debo
 * @date 2020-04-29
 */
@Configuration
public class HelloService1Config {

    /**
     * Conditional注解的条件成立才会创建bean
     *
     * @return
     */
    @Bean
    @Conditional(MagicExistCondition.class)
    public HelloService helloService() {
        return new HelloService1Impl();
    }
}
