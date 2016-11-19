package org.thframework.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thframework.model.RequestLog;

/**
 * Created on 2016/11/19.
 */
@Component
public class LogDao {

    @Autowired
    private SessionFactory sessionFactory;




    public void save(RequestLog requestLog) {
        sessionFactory.getCurrentSession().save(requestLog);
    }



}
