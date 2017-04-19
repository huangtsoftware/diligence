package base;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.thframework.model.CityInfo;
import org.thframework.model.LogInfo;
import org.thframework.service.CityInfoService;
import org.thframework.service.LogInfoService;
import org.thframework.utils.JsonUtils;

/**
 * Created on 2017/1/13.
 */
public class ServiceTest extends BaseTest {

    @Autowired
    private CityInfoService cityInfoService;

    @Autowired
    private LogInfoService logInfoService;

    @Test
    public void findByCode() {
        CityInfo cityInfo = cityInfoService.findByCode("CN101010100");
        Assert.assertNotNull(cityInfo);
    }

    @Test
    @Ignore
    public void updateCityInfos() {
        cityInfoService.updateCityInfos();
    }

    @Test
    @Ignore
    public void loginfoList() {
        Pageable pageable = new PageRequest(0, 10);
        Page<LogInfo> page = logInfoService.findAll(pageable);
        page.getContent().forEach(log -> System.out.println(JsonUtils.toString(log)));
    }

    @Test
    @Ignore
    public void cityInfoList() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(0, 10, sort);
        CityInfo cityInfo = new CityInfo();
        cityInfo.setCode("CN101010100");
        Page<CityInfo> page = cityInfoService.queryByCondition(cityInfo, pageable);
        page.getContent().forEach(city -> System.out.println(JsonUtils.toString(city)));
    }

}
