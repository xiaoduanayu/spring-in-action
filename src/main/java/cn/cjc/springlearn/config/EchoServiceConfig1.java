package cn.cjc.springlearn.config;

import cn.cjc.springlearn.service.EchoService;
import cn.cjc.springlearn.service.impl.EchoExecutor;
import cn.cjc.springlearn.service.impl.EchoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author debo
 * @date 2020-04-29
 */
@Configuration
@Import(EchoExecutorConfig.class)
public class EchoServiceConfig1 {

    @Bean
    public EchoService echoService(EchoExecutor echoExecutor) {
        return new EchoServiceImpl(echoExecutor);
    }
}
