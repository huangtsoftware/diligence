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
//        System.out.println(redisTemplate);
        query(1, 2);
    }


    List<BaseResource> query(int page, int pageSize) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("start", 1);
        params.put("limit", 3);
        String ecode = Base64Utils.encodeToString(JSON.toJSONString(params).getBytes());
        String kk = restTemplate.getForObject("http://127.0.0.1:12331/acs/privative/poi/resource/list", String.class, ecode);
        String result = Base64Utils.decodeFromString(kk).toString();
        return null;
    }

}
