package org.thframework.service.impl;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thframework.constant.CommonConstant;
import org.thframework.dao.CityInfoRepository;
import org.thframework.model.CityInfo;
import org.thframework.model.SystemConfig;
import org.thframework.service.CityInfoService;
import org.thframework.service.SystemConfigService;

import java.util.Date;
import java.util.List;

/**
 * Created on 2017/4/15.
 */
@Service
public class CityInfoServiceImpl implements CityInfoService {

    @Autowired
    private CityInfoRepository cityInfoRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SystemConfigService systemConfigService;

    @Override
    public void save(CityInfo cityInfo) {
        cityInfoRepository.save(cityInfo);
    }

    @Override
    public CityInfo findByCode(String code) {
        return cityInfoRepository.findByCode(code);
    }

    @Override
    public List<CityInfo> updateCityInfos() {
//        SystemConfig config = systemConfigService.findByKey(CommonConstant.city_info_url);
//        String result = restTemplate.getForObject(config.getValue(), String.class);
        String url = "https://cdn.heweather.com/china-city-list.json";
        String result = restTemplate.getForObject(url, String.class);
        List<CityInfo> cityInfoList = JSON.parseArray(result, CityInfo.class);
        cityInfoList.forEach(city -> {
            if (city.getCityzh().equals("北京")) {
                CityInfo cityInfo = findByCode(city.getCode());
                if (null == cityInfo) {
                    save(city);
                } else {
                    city.setId(cityInfo.getId());
                    save(city);
                }
            }
        });
        return cityInfoList;
    }
}
