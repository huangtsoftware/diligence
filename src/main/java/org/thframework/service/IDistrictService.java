package org.thframework.service;

import org.springframework.data.domain.Pageable;
import org.thframework.model.District;

import java.util.List;

/**
 * Created on 2016/11/15.
 */
public interface IDistrictService {

    public List<District> queryByCondition(District district, Pageable pageable);

    public District save(District district);


}
