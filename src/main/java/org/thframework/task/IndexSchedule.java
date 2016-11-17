package org.thframework.task;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * Created on 2016/11/17.
 *
 */

@Component
public class IndexSchedule {

    @Scheduled(fixedRate = 5000)
    public void index() {
        System.out.println("现在时间是：" + new Date());
        System.out.println(DateFormatUtils.ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT.format(new Date()));
    }

}
