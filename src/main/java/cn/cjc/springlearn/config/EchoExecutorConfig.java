package cn.cjc.springlearn.config;

import cn.cjc.springlearn.service.impl.EchoExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author debo
 * @date 2020-04-29
 */
@Configuration
public class EchoExecutorConfig {

    @Bean
    public EchoExecutor echoExecutor() {
        return new EchoExecutor();
    }
}
