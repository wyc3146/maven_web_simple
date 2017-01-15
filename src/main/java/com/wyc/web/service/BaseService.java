package com.wyc.web.service;/**
 * Created by wyc on 2017/01/15.
 */

import com.wyc.web.persistence.mapper.BaseEntityMapper;
import com.wyc.web.persistence.model.BaseEntity;
import com.wyc.web.persistence.model.User;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangyongcan
 * @Date 2017/01/15 19:22
 */
public abstract class BaseService<E extends BaseEntity,PK extends Serializable> {

    public void insert(E entity) {
        getBaseMapper().insert(entity);
    }

    public E find(PK id) {
        return getBaseMapper().find(id);
    }

    public int delete(E entity) {
        return getBaseMapper().delete(entity);
    }

    public int update(E entity) {
        return getBaseMapper().update(entity);
    }

    public List<E> findPage(E entity) {
        return getBaseMapper().findPage(entity);
    }

    public int countPage(E entity) {
        return getBaseMapper().countPage(entity);
    }

    protected abstract BaseEntityMapper<E,PK> getBaseMapper();
}
