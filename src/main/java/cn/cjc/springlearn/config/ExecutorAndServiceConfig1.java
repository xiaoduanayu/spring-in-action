package cn.cjc.springlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author debo
 * @date 2020-04-29
 */
@Configuration
@Import(EchoServiceConfig2.class)
@ImportResource("classpath:spring-bean.xml")
public class ExecutorAndServiceConfig1 {
}
