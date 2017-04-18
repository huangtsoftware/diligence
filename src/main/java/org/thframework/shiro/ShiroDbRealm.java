package org.thframework.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.thframework.model.UserInfo;
import org.thframework.service.UserInfoService;
import org.thframework.utils.BeanContext;

/**
 * Created on 2017/4/17.
 */
public class ShiroDbRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if (null == principals) {
            throw new AuthenticationException("principals can not be null");
        }
        // TODO

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());
        UserInfoService userInfoService = BeanContext.getContext().getBean(UserInfoService.class);
        UserInfo user = userInfoService.findByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(token.getUsername(),token.getPassword(), getName());
                return simpleAuthenticationInfo;
            } else {
                throw new IncorrectCredentialsException();
            }
        } else {
            throw new UnknownAccountException();
        }
    }
}
