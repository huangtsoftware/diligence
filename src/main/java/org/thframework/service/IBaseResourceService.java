package org.thframework.service;

import org.thframework.model.BaseResource;
import org.thframework.model.City;
import java.util.List;

/**
 * Created on 2016/11/15.
 */
public interface IBaseResourceService {

    public List<BaseResource> queryByCondition(BaseResource baseResource);

    public int save(BaseResource baseResource);
}
