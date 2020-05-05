package cn.cjc.springlearn.config;

import cn.cjc.springlearn.service.EchoService;
import cn.cjc.springlearn.service.impl.EchoExecutor;
import cn.cjc.springlearn.service.impl.EchoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注解式配置，显式声明EchoService bean
 *
 * @author debo
 * @date 2020-04-28
 */
@Configuration
public class EchoServiceConfig {
    /**
     * 使用@Bean注解显式声明的意义在于：假设EchoServiceImpl是第三方jar包
     * 中的类，你无法在其中添加@Component注解，因此只能显式声明
     * 使用@Bean注解后默认bean id同方法名
     *
     * @return
     */
    @Bean
    public EchoService echoService() {
        return new EchoServiceImpl();
    }

    /**
     * 会自动把echoExecutor bean注入进来，这个echoExecutor bean可以来自XML，自动扫描等任何形式产生的bean
     * 通过外部设置echoExecutor的原因是你无法在第三方jar包EchoServiceImpl
     * 的echoExecutor实例变量上加上@Autowired注解
     *
     * @param echoExecutor
     * @return
     */
    @Bean(name = "echoService2")
    public EchoService echoService2(EchoExecutor echoExecutor) {
        return new EchoServiceImpl(echoExecutor);
    }

    /**
     * 和echoService2功能相同
     *
     * @return
     */
    @Bean(name = "echoService3")
    public EchoService echoService3() {
        return new EchoServiceImpl(echoExecutor());
    }

    @Bean
    public EchoExecutor echoExecutor() {
        return new EchoExecutor();
    }
}
