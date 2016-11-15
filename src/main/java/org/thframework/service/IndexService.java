package org.thframework.service;

import org.thframework.model.City;

import java.util.List;

/**
 * Created by huangteng on 2016/11/15.
 *
 */
public interface IndexService {

    public List<City> findAll();

    public String save(City city);
}
