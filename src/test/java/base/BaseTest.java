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
public class BaseTest {


}
