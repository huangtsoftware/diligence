package org.thframework.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.model.City;
import org.thframework.service.IndexService;
import java.util.Date;
import java.util.List;

/**
 * Created on 2016/11/15.
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {


    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        List<City> cities = indexService.findAll();
        return JSON.toJSONString(cities);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        City city = new City();
        city.setName("kk" + new Date());
        indexService.save(city);
        return "sucess..";
    }





}
