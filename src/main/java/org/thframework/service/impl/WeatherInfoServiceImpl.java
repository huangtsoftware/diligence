package org.thframework.service.impl;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thframework.constant.CommonConstant;
import org.thframework.domain.weather.WeatherInfoData;
import org.thframework.model.SystemConfig;
import org.thframework.service.SystemConfigService;
import org.thframework.service.WeatherInfoService;

/**
 * Created on 2017/4/15.
 */
@Service
public class WeatherInfoServiceImpl implements WeatherInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SystemConfigService systemConfigService;

    @Override
    public WeatherInfoData getWeatherInfoData(String city) {
        SystemConfig systemConfig = systemConfigService.findByKey(CommonConstant.weather_info_url);
//        String url = "https://free-api.heweather.com/v5/weather?key=5d276a85cdc04c2bbf63e05e2a0dd7c3&city=" + city;
        String url = systemConfig.getValue() + city;
        JSON.toJSONString(null);
        String result = restTemplate.getForObject(url, String.class);
        WeatherInfoData weatherInfoData = JSON.parseObject(result, WeatherInfoData.class);
        return weatherInfoData;
    }
}
