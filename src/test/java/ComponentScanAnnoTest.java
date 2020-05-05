import cn.cjc.springlearn.config.HelloServiceConfig;
import cn.cjc.springlearn.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author debo
 * @date 2020-04-28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloServiceConfig.class)
public class ComponentScanAnnoTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void testHelloService() {
        helloService.sayHello("debo");
    }
}
