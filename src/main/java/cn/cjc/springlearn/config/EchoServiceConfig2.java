package cn.cjc.springlearn.config;

import cn.cjc.springlearn.service.EchoService;
import cn.cjc.springlearn.service.impl.EchoExecutor;
import cn.cjc.springlearn.service.impl.EchoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author debo
 * @date 2020-04-29
 */
@Configuration
public class EchoServiceConfig2 {

    @Bean
    public EchoService echoService(EchoExecutor echoExecutor) {
        return new EchoServiceImpl(echoExecutor);
    }
}
