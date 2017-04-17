package org.thframework.service;

import org.thframework.model.UserInfo;

/**
 * Created on 2017/4/17.
 */
public interface UserInfoService {

    UserInfo findByUsername(String username);

    void save(UserInfo userInfo);
}
