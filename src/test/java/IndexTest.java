import javax.annotation.Resource;

import org.junit.Test;
import org.thframework.service.IndexService;

public class IndexTest extends BaseTeset {

    @Resource
    private IndexService indexService;
    
    @Test
    public void test() {
        System.out.println(indexService.findAll());
    }
}
