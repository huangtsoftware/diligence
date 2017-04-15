package org.thframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.thframework.dao.SystemConfigRepository;
import org.thframework.model.SystemConfig;
import org.thframework.service.SystemConfigService;

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
public class SystemConfigServiceImpl implements SystemConfigService {

    @Autowired
    private SystemConfigRepository systemConfigRepository;

    @Override
    public SystemConfig findByKey(String key) {
        return systemConfigRepository.findByKey(key);
    }

    @Override
    public List<SystemConfig> queryByCondition(SystemConfig systemConfig, Pageable pageable) {
        Page<SystemConfig> page = systemConfigRepository.findAll(create(systemConfig), pageable);
        return page.getContent();
    }

    @Override
    public SystemConfig save(SystemConfig systemConfig) {
        return systemConfigRepository.save(systemConfig);
    }

    private Specification create(SystemConfig systemConfig) {

        return new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder builder) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                if (systemConfig.getId() != null && systemConfig.getId() != 0) {
                    predicates.add(builder.equal(root.get("id"),  systemConfig.getId()));
                }
                return builder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}
