package cn.cjc.springlearn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 注解式配置，支持自动扫包
 * ComponentScan注解默认扫描HelloServiceConfig类所在包及其子包下的类
 *
 * @author debo
 * @date 2020-04-28
 */
@Configuration
@ComponentScan("cn.cjc.springlearn.service")
public class HelloServiceConfig {
}
