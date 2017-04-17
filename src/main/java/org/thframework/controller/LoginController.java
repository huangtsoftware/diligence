package org.thframework.controller;

import com.alibaba.fastjson.JSON;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thframework.dto.ResultInfo;
import org.thframework.model.UserInfo;
import org.thframework.service.UserInfoService;

/**
 * Created on 2017/4/17.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("login")
    @ResponseBody
    public ResultInfo login(UserInfo userInfo) {
        ResultInfo resultInfo = new ResultInfo();
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUsername(), userInfo.getPassword());
//        token.setRememberMe(true);//记住我功能
        try {
            subject.login(token);
            return resultInfo.buildSuccessResultInfo();
        } catch (UnknownAccountException uae) {
            LOGGER.error("用户名不存在！{}", JSON.toJSONString(userInfo), uae);
            return resultInfo.buildFailureResultInfo(0, "用户名不存在！");
        } catch (IncorrectCredentialsException ice) {
            LOGGER.error("用户密码不正确！{}", JSON.toJSONString(userInfo), ice);
            return resultInfo.buildFailureResultInfo(0, "用户密码错误！");
        } catch (Exception e) {
            LOGGER.error("登陆异常！{}", JSON.toJSONString(userInfo), e);
            return resultInfo.buildFailureResultInfo(0, "登陆异常！");
        }
    }

    @RequestMapping("logout")
    @ResponseBody
    public ResultInfo logout(UserInfo userInfo) {
        ResultInfo resultInfo = new ResultInfo();
        org.apache.shiro.subject.Subject user = SecurityUtils.getSubject();
        user.logout();
        return resultInfo.buildSuccessResultInfo();
    }

    @RequestMapping("register")
    @ResponseBody
    public ResultInfo register(UserInfo userInfo) {
        ResultInfo resultInfo = new ResultInfo();
        try {
            userInfoService.save(userInfo);
        } catch (Exception e) {
            return ResultInfo.buildFailureResultInfo(0, "用户注册失败");
        }
        return resultInfo.buildSuccessResultInfo();
    }


}
