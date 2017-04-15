package base;

import com.alibaba.fastjson.JSON;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;
import org.thframework.model.District;
import org.thframework.service.IDistrictService;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

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
    @Ignore
    public void testIndexService() {
        for (int i = 0; i < 1100; i++) {
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
            d = districtServiceImpl.save(d);
            redisTemplate.opsForHash().put("ha", d.getId().toString(), JSON.toJSONString(d));
            mongoTemplate.save(d);
            System.out.println(JSON.toJSON(d));
        }

    }

    @Test
    @Ignore
    public void test() throws IOException {
        FileInputStream in = new FileInputStream(new File("D:\\opt\\tuniu\\logs\\tomcat\\app\\tomcat_ats_acs\\acs.log"));
        Scanner scanner = new Scanner(in);
        while (scanner.hasNextLine()) {
            District d = new District();
            d.setName(scanner.nextLine());
            districtServiceImpl.save(d);
        }
        in.close();
        scanner.close();
    }


}
