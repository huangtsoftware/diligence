package base;

import org.junit.Test;
import org.thframework.service.IBaseResourceService;

import javax.annotation.Resource;

/**
 * Created on 2017/1/13.
 */
public class ServiceTest extends BaseTest {
    @Resource
    private IBaseResourceService indexService;

    @Test
    public void testIndexService() {
//        System.out.println(indexService.findAll());
    }
}
