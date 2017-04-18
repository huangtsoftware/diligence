package base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 2016/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:D:\\Projects\\ProjectTwo\\gitoschina\\diligence\\src\\main\\resources\\spring-hibernate.xml",
        "file:D:\\Projects\\ProjectTwo\\gitoschina\\diligence\\src\\main\\resources\\spring-mvc.xml",
        "file:D:\\Projects\\ProjectTwo\\gitoschina\\diligence\\src\\main\\resources\\spring-redis.xml",
        "file:D:\\Projects\\ProjectTwo\\gitoschina\\diligence\\src\\main\\resources\\spring-task.xml"})
public class BaseTest {


}
