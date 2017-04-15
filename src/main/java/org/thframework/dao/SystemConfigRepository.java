package org.thframework.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.thframework.model.SystemConfig;

/**
 * Created on 2016/11/15.
 */
@Repository
public interface SystemConfigRepository extends PagingAndSortingRepository<SystemConfig, Integer>, JpaSpecificationExecutor<SystemConfig> {


    SystemConfig findByKey(String key);
}
