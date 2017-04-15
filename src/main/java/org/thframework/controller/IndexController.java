package org.thframework.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.service.CityInfoService;

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

    @RequestMapping("/home")
    public String index() {
        System.out.println("home......");
        return "home";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        cityInfoService.updateCityInfos();
        return "sucess..";
    }



}
