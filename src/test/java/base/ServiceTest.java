package base;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created on 2017/1/13.
 */
public class ServiceTest extends BaseTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    @Ignore
    public void testIndexService() {


    }

    @Test
    @Ignore
    public void test() throws IOException {

    }


}
