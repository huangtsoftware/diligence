package org.thframework.utils;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.MapperKey;
import ma.glasnost.orika.metadata.TypeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author
 */
public class ClassCopyUtil {

    static Logger LOGGER = LoggerFactory.getLogger(ClassCopyUtil.class);

    private static final MapperFactory MAPPER_FACTORY = new DefaultMapperFactory.Builder().build();

    public static <S, D> D copy(S sourceObject, Class<D> destinationClass) {
        try {
            MapperKey mapperKey = new MapperKey(TypeFactory.valueOf(sourceObject.getClass()), TypeFactory.valueOf(destinationClass));
            if (MAPPER_FACTORY.getClassMap(mapperKey) == null) {
                MAPPER_FACTORY.classMap(sourceObject.getClass(), destinationClass).byDefault().register();
            }
            return MAPPER_FACTORY.getMapperFacade().map(sourceObject, destinationClass);
        } catch (Exception e) {
            LOGGER.error("", e);
        }
        return null;
    }

    public static <S, D> List<D> copyList(List<S> sourceObjectIterator, Class<S> sourceClass, Class<D> destinationClass) {
        if (sourceObjectIterator == null) {
            return null;
        }
        List<D> destinationObjList = null;
        try {
            MapperKey mapperKey = new MapperKey(TypeFactory.valueOf(sourceClass),
                    TypeFactory.valueOf(destinationClass));
            if (MAPPER_FACTORY.getClassMap(mapperKey) == null) {
                MAPPER_FACTORY.classMap(sourceClass, destinationClass).byDefault().register();
            }
            destinationObjList = MAPPER_FACTORY.getMapperFacade().mapAsList(sourceObjectIterator, destinationClass);
        } catch (Exception e) {
            LOGGER.error("", e);
        }
        return destinationObjList;
    }
}
