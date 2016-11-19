package org.thframework.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2016/11/19.
 */
public class CommonUtils {


    public static String toJSONString(Object object) {
        return JSON.toJSONString(object);
    }


    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
