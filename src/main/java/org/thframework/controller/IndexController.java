package org.thframework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.model.City;
import org.thframework.service.IDistrictService;

import java.util.Date;

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
        City city = new City();
        city.setName("kk" + new Date());
//        indexService.save(city);
        return "sucess..";
    }



}
