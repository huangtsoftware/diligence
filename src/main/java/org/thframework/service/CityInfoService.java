package org.thframework.service;

import org.thframework.model.CityInfo;

import java.util.List;

/**
 * Created on 2017/4/15.
 */
public interface CityInfoService {


    void save(CityInfo cityInfo);

    CityInfo findByCode(String code);

    List<CityInfo> updateCityInfos();

}
