package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thframework.dao.CityDao;
import org.thframework.model.City;
import org.thframework.service.IndexService;
import java.util.List;

/**
 * Created on 2016/11/15.
 */
@Service
public class IndexServiceImpl implements IndexService {


    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAll() {

        return cityDao.findAll();
    }

    @Override
    public String save(City city) {
        cityDao.save(city);
        return city.toString();
    }

}
