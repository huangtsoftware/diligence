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

    @Scheduled(fixedRate = 60000)
    public void index() {
        System.out.println("定时任务，现在时间是：".concat(DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.format(new Date())));
    }



}
