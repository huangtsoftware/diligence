package org.thframework.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.thframework.model.District;

/**
 * Created on 2016/11/15.
 */
@Repository
public interface DistrictRepository extends PagingAndSortingRepository<District, Integer>, JpaSpecificationExecutor<District> {


}
