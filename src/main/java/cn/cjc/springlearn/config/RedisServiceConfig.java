package cn.cjc.springlearn.config;

import cn.cjc.springlearn.service.impl.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 注解@PropertySource会将classpath目录下的属性文件加载到Environment实例中
 *
 * @author debo
 * @date 2020-04-30
 */
@Configuration
@PropertySource("classpath:redis.properties")
public class RedisServiceConfig {

    @Autowired
    private Environment environment;

    @Bean
    public RedisService redisService() {
        return new RedisService(
                environment.getProperty("redis.address"), environment.getProperty("redis.port", Integer.class));
    }
}
