package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thframework.dao.BaseResourceDao;
import org.thframework.model.BaseResource;
import org.thframework.service.IBaseResourceService;

import java.util.List;

/**
 * Created on 2016/11/15.
 */
@Service
public class BaseResourceServiceImpl implements IBaseResourceService {


    @Autowired
    private BaseResourceDao baseResourceDao;


    @Override
    public List<BaseResource> queryByCondition(BaseResource baseResource) {
        return baseResourceDao.queryByCondition(baseResource);
    }

    @Override
    public int save(BaseResource baseResource) {
        return baseResourceDao.save(baseResource);
    }
}
