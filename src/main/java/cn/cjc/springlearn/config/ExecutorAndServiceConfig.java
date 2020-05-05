package cn.cjc.springlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author debo
 * @date 2020-04-29
 */
@Configuration
@Import({EchoExecutorConfig.class, EchoServiceConfig2.class})
public class ExecutorAndServiceConfig {
}
