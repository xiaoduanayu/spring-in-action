import cn.cjc.springlearn.config.HelloService1Config;
import cn.cjc.springlearn.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author debo
 * @date 2020-04-29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloService1Config.class)
public class ConditionalAnnoTest {
    @Autowired(required = false)
    private HelloService helloService;

    @Test
    public void test() {
        Assert.assertNull(helloService);
    }
}