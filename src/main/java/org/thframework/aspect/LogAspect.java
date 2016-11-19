package org.thframework.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2016/11/19.
 */
public class LogAspect {

    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    public void before(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "; params:{}", JSON.toJSONString(joinPoint.getArgs()));

    }

    public void after(JoinPoint joinPoint, Object retValue) {
        logger.info(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "; return:{}", JSON.toJSONString(retValue));

    }
}
