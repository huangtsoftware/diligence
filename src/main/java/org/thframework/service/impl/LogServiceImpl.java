package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thframework.dao.LogDao;
import org.thframework.model.RequestLog;
import org.thframework.service.LogService;

/**
 * Created on 2016/11/19.
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    public void save(RequestLog requestLog) {
        logDao.save(requestLog);
    }
}
