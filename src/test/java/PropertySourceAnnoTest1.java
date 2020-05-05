import cn.cjc.springlearn.config.RedisService1Config;
import cn.cjc.springlearn.service.impl.RedisService1;
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
@ContextConfiguration(classes = RedisService1Config.class)
public class PropertySourceAnnoTest1 {

    @Autowired
    private RedisService1 redisService1;

    @Test
    public void test() {
        System.out.println(redisService1.getAddress() + ":" + redisService1.getPort());
    }
}
