package org.thframework.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thframework.model.LogInfo;
import org.thframework.service.LogInfoService;
import org.thframework.utils.CommonUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created on 2016/11/18.
 * 拦截器
 *
 *
 */
public class RequestInterceptor implements HandlerInterceptor {

    @Autowired
    private LogInfoService logInfoService;

    Logger LOGGER = LoggerFactory.getLogger(RequestInterceptor.class);

    /**
     * 进入方法前调用
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LogInfo logInfo = new LogInfo();
        String uri = request.getRequestURI();
        Map map = request.getParameterMap();
        logInfo.setUrl(uri);
        logInfo.setParams(CommonUtils.toJSONString(map));
        logInfo.setRemoteIP(CommonUtils.getIpAddr(request));
        logInfoService.save(logInfo);
        return true;
    }

    /**
     * 方法执行后调用
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 执行完视图后调用
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }



}
