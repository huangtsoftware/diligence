package base;

import org.junit.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.thframework.model.District;
import org.thframework.service.IDistrictService;

import javax.annotation.Resource;

/**
 * Created on 2017/1/13.
 */
public class ServiceTest extends BaseTest {

    @Resource
    private IDistrictService districtServiceImpl;

    @Test
    public void testIndexService() {
        District district = new District();
        Pageable pageable = new PageRequest(0, 3);
        System.out.println(districtServiceImpl.queryByCondition(district, pageable));
    }
}
