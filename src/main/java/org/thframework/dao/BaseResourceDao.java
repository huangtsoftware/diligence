package org.thframework.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thframework.model.BaseResource;

import java.util.List;

/**
 * Created on 2016/11/15.
 */
@Repository
public class BaseResourceDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<BaseResource> queryByCondition(BaseResource baseResource) {
        Session session = sessionFactory.getCurrentSession();
//        session.createQuery("from BaseResource;");
        return null;
    }

    public int save(BaseResource baseResource) {
        Session session = sessionFactory.getCurrentSession();
        session.save(baseResource);
        session.flush();
        session.close();
        return 1;
    }

}
