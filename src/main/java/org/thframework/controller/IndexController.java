package org.thframework.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.model.CityInfo;
import org.thframework.service.CiytInfoService;
import org.thframework.service.IDistrictService;
import org.thframework.utils.HttpRequest;

import java.util.List;

/**
 * Created on 2016/11/15.
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    Logger log = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IDistrictService indexService;

    @Autowired
    private CiytInfoService ciytInfoService;

    @RequestMapping("/home")
    public String index() {
        System.out.println("home......");
        return "home";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list() {
//        List<City> cities = indexService.findAll();
//        log.info(JSON.toJSONString(cities));
//        return CommonUtils.toJSONString(cities);
        return null;
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        String result = HttpRequest.sendGet("https://cdn.heweather.com/china-city-list.json", "");
        List<CityInfo> cityInfoList = JSON.parseArray(result, CityInfo.class);
        System.out.println(cityInfoList);
        return "sucess..";
    }



}
