package org.thframework.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 辅助访问Spring
 * @author wangbing
 * @since 2016-03-05
 */
@Component
public class BeanContext implements ApplicationContextAware {
    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext appContext) throws BeansException {
        context = appContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
