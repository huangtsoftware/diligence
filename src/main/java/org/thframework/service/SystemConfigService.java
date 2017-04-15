package org.thframework.service;

import org.springframework.data.domain.Pageable;
import org.thframework.model.SystemConfig;

import java.util.List;

/**
 * Created on 2016/11/15.
 */
public interface SystemConfigService {

    SystemConfig findByKey(String key);

    List<SystemConfig> queryByCondition(SystemConfig systemConfig, Pageable pageable);

    SystemConfig save(SystemConfig systemConfig);


}
