package org.thframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.domain.weather.WeatherInfoData;
import org.thframework.dto.ResultInfo;
import org.thframework.model.SystemConfig;
import org.thframework.service.CityInfoService;
import org.thframework.service.WeatherInfoService;

/**
 * Created on 2017/4/18.
 */
@Controller
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherInfoService weatherInfoService;

    @Autowired
    private CityInfoService cityInfoService;

    @RequestMapping("/weather")
    @ResponseBody
    public ResultInfo weather(SystemConfig config) {
        String city = config.getValue();
        return ResultInfo.buildSuccessResultInfo(weatherInfoService.getWeatherInfoData(city));
    }

    @RequestMapping("/updateCityInfos")
    @ResponseBody
    public ResultInfo updateCityInfos() {
        cityInfoService.updateCityInfos();
        return ResultInfo.buildSuccessResultInfo();
    }
}
