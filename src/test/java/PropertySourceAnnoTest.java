import cn.cjc.springlearn.config.RedisServiceConfig;
import cn.cjc.springlearn.service.impl.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author debo
 * @date 2020-04-30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisServiceConfig.class)
public class PropertySourceAnnoTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void test() {
        System.out.println(redisService.getAddress() + ":" + redisService.getPort());
    }
}
