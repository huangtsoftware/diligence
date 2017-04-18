package org.thframework.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.thframework.model.LogInfo;

/**
 * Created on 2016/11/19.
 */
public interface LogInfoService {

    void save(LogInfo logInfo);

    Page<LogInfo> findAll(Pageable pageable);

}
