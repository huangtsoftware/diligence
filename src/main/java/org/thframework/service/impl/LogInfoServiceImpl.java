package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.thframework.dao.LogInfoRepository;
import org.thframework.model.LogInfo;
import org.thframework.service.LogInfoService;

import java.util.Date;

/**
 * Created on 2016/11/19.
 */
@Service
public class LogInfoServiceImpl implements LogInfoService {

    @Autowired
    private LogInfoRepository logInfoRepository;

    public void save(LogInfo logInfo) {
        logInfoRepository.save(logInfo);
    }

    @Override
    public Page<LogInfo> findAll(Pageable pageable) {
        return logInfoRepository.findAll(pageable);
    }
}
