import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.thframework.service.IndexService;
import javax.annotation.Resource;

/**
 * Created on 2016/11/15.
 */
@Transactional("transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-hibernate-test.xml", "classpath:spring-task-test.xml" })
public class BaseTeset {

    @Resource
    private IndexService indexService;
    
    @Test
    public void test() {
        System.out.println(indexService.findAll());
    }

}
