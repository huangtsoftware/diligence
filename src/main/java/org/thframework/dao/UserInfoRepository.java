package org.thframework.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.thframework.model.UserInfo;

/**
 * Created on 2017/4/17.
 */
@Repository
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, Long>, JpaSpecificationExecutor<UserInfo> {


    UserInfo findByUsername(UserInfo userInfo);
}
