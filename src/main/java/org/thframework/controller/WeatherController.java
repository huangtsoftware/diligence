package org.thframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.domain.weather.WeatherInfoData;
import org.thframework.model.SystemConfig;
import org.thframework.service.WeatherInfoService;

/**
 * Created on 2017/4/18.
 */
@Controller
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherInfoService weatherInfoService;

    @RequestMapping("/weather")
    @ResponseBody
    public WeatherInfoData weather(SystemConfig config) {
        String city = config.getValue();
        return weatherInfoService.getWeatherInfoData(city);
    }

}
