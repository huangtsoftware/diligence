package redis;

import base.BaseTest;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;
import org.thframework.model.BaseResource;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2017/1/13.
 */
public class RedisTest extends BaseTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private RestTemplate restTemplate;

    @Test
    public void testRedisTemplate() {
        redisTemplate.opsForHash().put("test", "name", "hahahahahh");
    }




}
