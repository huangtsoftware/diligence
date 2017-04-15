package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thframework.dao.CityInfoRepository;
import org.thframework.model.CityInfo;
import org.thframework.service.CiytInfoService;

/**
 * Created on 2017/4/15.
 */
@Service
public class CityInfoServiceImpl implements CiytInfoService {

//    @Autowired
//    private CityInfoRepository cityInfoRepository;

    @Override
    public void save(CityInfo cityInfo) {
//        cityInfoRepository.save(cityInfo);
    }
}
