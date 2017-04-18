package org.thframework.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/")
    public String index() {

        return "home";
    }

}
