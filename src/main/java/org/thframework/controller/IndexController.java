package org.thframework.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.domain.weather.WeatherInfoData;
import org.thframework.model.SystemConfig;
import org.thframework.model.UserInfo;
import org.thframework.service.CityInfoService;
import org.thframework.service.WeatherInfoService;

import javax.servlet.http.HttpSession;

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


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserInfo userInfo, HttpSession session) {
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUsername(), userInfo.getPassword());
        token.setRememberMe(true);//记住我功能
        try {
            subject.login(token);
            return "main";
        } catch (UnknownAccountException uae) {
            return "login";
        } catch (IncorrectCredentialsException ice) {
            return "login";
        } catch (Exception e) {
            return "login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        org.apache.shiro.subject.Subject user = SecurityUtils.getSubject();
        user.logout();
        return "/login";
    }

}
