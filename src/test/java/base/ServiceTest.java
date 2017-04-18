package base;

import com.alibaba.fastjson.JSON;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.thframework.model.LogInfo;
import org.thframework.service.CityInfoService;
import org.thframework.service.LogInfoService;

/**
 * Created on 2017/1/13.
 */
public class ServiceTest extends BaseTest {

//    @Resource
//    private RedisTemplate redisTemplate;
//
//    @Resource
//    private RestTemplate restTemplate;
//
//    @Resource
//    private MongoTemplate mongoTemplate;

    @Autowired
    private CityInfoService cityInfoService;

    @Autowired
    private LogInfoService logInfoService;

    @Test
    public void findByCode() {
        cityInfoService.findByCode("");
    }

    @Test
    @Ignore
    public void updateCityInfos() {
        cityInfoService.updateCityInfos();
    }

    @Test
    public void list() {
        Pageable pageable = new PageRequest(1, 5);
        Page<LogInfo> page = logInfoService.findAll(pageable);
        page.getContent().forEach(log -> System.out.println(JSON.toJSONString(log)));
    }


}
