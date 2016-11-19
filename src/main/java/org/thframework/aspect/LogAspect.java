package org.thframework.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thframework.utils.CommonUtils;

/**
 * Created on 2016/11/19.
 */
public class LogAspect {


    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 进入方法前调用
     * @param joinPoint
     */
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        String params = CommonUtils.toJSONString(joinPoint.getArgs());
        logger.info(methodName + "; params:{}", params);

    }

    /**
     * 方法返回后调用
     * @param joinPoint
     * @param retValue
     */
    public void after(JoinPoint joinPoint, Object retValue) {
        String methodName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info(methodName + "; return:{}", JSON.toJSONString(retValue));

    }
}
