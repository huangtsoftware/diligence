package org.thframework.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thframework.model.RequestLog;
import org.thframework.service.LogService;
import org.thframework.utils.CommonUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * Created on 2016/11/18.
 * 拦截器
 *
 *
 */
public class RequestInterceptor implements HandlerInterceptor {

    @Autowired
    private LogService logService;

    Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("preHandle:{}", CommonUtils.toJSONString(handler));
        RequestLog requestLog = new RequestLog();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        Map map = request.getParameterMap();
        requestLog.setUrl(uri);
        requestLog.setParams(CommonUtils.toJSONString(map));
        requestLog.setType(method);
        requestLog.setAddTime(new Date());
        requestLog.setRemoteIP(CommonUtils.getIpAddr(request));
        logService.save(requestLog);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle:{}", CommonUtils.toJSONString(handler));

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("afterCompletion:{}", CommonUtils.toJSONString(handler));

    }



}
