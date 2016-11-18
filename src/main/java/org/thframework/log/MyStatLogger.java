package org.thframework.log;

import com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2016/11/18.
 */
public class MyStatLogger extends DruidDataSourceStatLoggerImpl {

    Logger logger = LoggerFactory.getLogger(MyStatLogger.class);


}
