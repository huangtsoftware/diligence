package org.thframework.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.thframework.model.CityInfo;

/**
 * Created on 2017/4/15.
 */
@Repository
public interface CityInfoRepository extends PagingAndSortingRepository<CityInfo, Integer>, JpaSpecificationExecutor<CityInfo> {

}
