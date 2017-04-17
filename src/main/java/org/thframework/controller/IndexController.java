package org.thframework.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.domain.weather.WeatherInfoData;
import org.thframework.model.SystemConfig;
import org.thframework.service.CityInfoService;
import org.thframework.service.WeatherInfoService;

/**
 * Created on 2016/11/15.
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private CityInfoService cityInfoService;

    @Autowired
    private WeatherInfoService weatherInfoService;

    @RequestMapping("/home")
    public String index() {
        LOGGER.info("现在计入home,{}", "你好");
        System.out.println("home......");
        return "home";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        cityInfoService.updateCityInfos();
        return "sucess..";
    }

    @RequestMapping("/weather")
    @ResponseBody
    public WeatherInfoData weather(SystemConfig config) {
        String city = config.getValue();
        return weatherInfoService.getWeatherInfoData(city);
    }


}
