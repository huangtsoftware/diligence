package org.thframework.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thframework.model.City;

import java.util.List;

/**
 * Created by huangteng on 2016/11/15.
 */
@Repository
public class CityDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<City> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from City");
        return query.list();
    }

    public void save(City city) {
        Session session = sessionFactory.getCurrentSession();
        session.save(city);
    }

}
