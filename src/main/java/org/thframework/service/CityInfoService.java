package org.thframework.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.thframework.model.CityInfo;

import java.util.List;

/**
 * Created on 2017/4/15.
 */
public interface CityInfoService {


    void save(CityInfo cityInfo);

    CityInfo findByCode(String code);

    List<CityInfo> updateCityInfos();

    Page<CityInfo> queryByCondition(CityInfo cityInfo, Pageable pageable);
}
