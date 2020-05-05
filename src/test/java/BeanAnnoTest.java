import cn.cjc.springlearn.config.EchoServiceConfig;
import cn.cjc.springlearn.service.EchoService;
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
@ContextConfiguration(classes = EchoServiceConfig.class)
public class BeanAnnoTest {
    @Autowired
    private EchoService echoService;

    @Autowired
    private EchoService echoService2;

    @Autowired
    private EchoService echoService3;

    @Test
    public void testEchoService() {
        System.out.println(echoService.echo("well done!"));
    }

    @Test
    public void testEchoService2() {
        System.out.println(echoService2.echoAgain("well done!"));
    }

    @Test
    public void testEchoService3() {
        System.out.println(echoService3.echoAgain("well done!"));
    }
}
