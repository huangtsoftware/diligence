package base;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;
import org.thframework.model.District;
import org.thframework.service.IDistrictService;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created on 2017/1/13.
 */
public class ServiceTest extends BaseTest {

    @Resource
    private IDistrictService districtServiceImpl;


    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void testIndexService() {
//        District district = new District();
//        district.setId(1);
//        Pageable pageable = new PageRequest(0, 1);
//        System.out.println(JSON.toJSONString(districtServiceImpl.queryByCondition(district, pageable)));
        for (int i = 0; i < 110; i++) {
            District d = new District();
            d.setId(i);
            d.setName("k + " + i);
            d.setAddTime(new Date());
            d.setUpdateTime(new Date());
            d.setDelFlag(0);
            d.setAddName("kk");
            d.setEnglishName("th");
            d.setShortName("d");
            d.setSpell("sdf");
            d.setAddUid(1);
            d.setUpdateUid(2);
//            d = districtServiceImpl.save(d);
            redisTemplate.opsForHash().put("ha", d.getId().toString(), JSON.toJSONString(d));
            mongoTemplate.save(d);
            System.out.println(JSON.toJSON(d));
        }

    }


}
