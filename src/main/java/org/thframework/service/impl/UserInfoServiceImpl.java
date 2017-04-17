package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thframework.dao.UserInfoRepository;
import org.thframework.model.UserInfo;
import org.thframework.service.UserInfoService;

/**
 * Created on 2017/4/17.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo findByUsername(UserInfo userInfo) {
        return userInfoRepository.findByUsername(userInfo);
    }
}
