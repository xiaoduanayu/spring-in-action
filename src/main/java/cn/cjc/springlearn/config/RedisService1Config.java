package cn.cjc.springlearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * PropertySourcesPlaceholderConfigurer配合@PropertySource，使用占位符的方式注入值
 *
 * @author debo
 * @date 2020-04-30
 */
@Configuration
@ComponentScan("cn.cjc.springlearn.service")
@PropertySource("classpath:redis.properties")
public class RedisService1Config {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
