import cn.cjc.springlearn.config.ExecutorAndServiceConfig1;
import cn.cjc.springlearn.service.EchoService;
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
@ContextConfiguration(classes = ExecutorAndServiceConfig1.class)
public class ImportResourceAnnoTest {

    @Autowired
    private EchoService echoService;

    @Test
    public void test() {
        System.out.println(echoService.echoAgain("hello"));
    }
}
