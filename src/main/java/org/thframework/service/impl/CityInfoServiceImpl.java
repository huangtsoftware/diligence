package org.thframework.service.impl;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thframework.dao.CityInfoRepository;
import org.thframework.model.CityInfo;
import org.thframework.service.CityInfoService;
import org.thframework.service.SystemConfigService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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
            CityInfo cityInfo = findByCode(city.getCode());
            if (null == cityInfo) {
                save(city);
            } else {
                city.setId(cityInfo.getId());
                save(city);
            }
        });
        return cityInfoList;
    }

    // http://www.open-open.com/lib/view/open1451917140511.html
    // https://my.oschina.net/zhaoqian/blog/133500
    @Override
    public Page<CityInfo> queryByCondition(CityInfo cityInfo, Pageable pageable) {
        return cityInfoRepository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (StringUtils.isNotBlank(cityInfo.getCode())) {
                predicates.add(cb.equal(root.get("code"), cityInfo.getCode()));
            }
            if (StringUtils.isNotBlank(cityInfo.getCityzh())) {
                predicates.add(cb.equal(root.get("countryzh"), cityInfo.getCountryzh()));
            }
            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        }, pageable);
    }
}
