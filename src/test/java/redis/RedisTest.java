package redis;

import base.BaseTest;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;
import org.thframework.service.IDistrictService;

import javax.annotation.Resource;

/**
 * Created on 2017/1/13.
 */
public class RedisTest extends BaseTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private IDistrictService districtServiceImpl;

    @Test
    public void testRedisTemplate() {


    }




}
