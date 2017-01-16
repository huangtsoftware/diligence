package base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 2016/11/15.
 */
@Transactional("transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-hibernate-test.xml", "classpath:spring-task-test.xml",
        "classpath:spring-redis-test.xml", "classpath:spring-rest.xml" ,"classpath:spring-mongodb-test.xml"})
public class BaseTest {


}
