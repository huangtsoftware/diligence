package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.thframework.dao.DistrictRepository;
import org.thframework.model.District;
import org.thframework.service.IDistrictService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/11/15.
 */
@Service
public class DistrictServiceImpl implements IDistrictService {


    @Autowired
    private DistrictRepository districtRepository;


    @Override
    public List<District> queryByCondition(District district, Pageable pageable) {
        Page<District> page = districtRepository.findAll(create(district), pageable);
        return page.getContent();
    }

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    private Specification create(District district) {

        return new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder builder) {
                List<Predicate> predicates = new ArrayList<Predicate>();

                return builder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}
