package org.thframework.utils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * Created on 2016/11/19.
 */
public class CommonUtils {

    /**
     * 获取客户端IP地址
     * @param request
     * @return
     */
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

    public static void replaceNull(Object data, Class<?> clazz) throws IllegalAccessException {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(data) == null) {
                if (field.getType() == String.class) {
                    field.set(data, "");
                } else if (field.getType() == Integer.class) {
                    field.set(data, 0);
                }
            }
        }
    }

}
