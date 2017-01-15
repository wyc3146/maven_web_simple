package com.wyc.web.persistence.mapper;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wyc on 2017/01/15.
 */
public interface BaseEntityMapper<T,PK extends Serializable> {
    /**
     * 根据id查找对应实体
     * @param id
     * @return
     */
    T find(final PK id);

    /**
     * 插入数据
     * @param entity
     */
    void insert(final T entity);

    /**
     * 修改数据
     * @param entity
     * @return
     */
    int update(final T entity);

    /**
     * 删除数据
     * @param entity
     * @return
     */
    int delete(final T entity);

    /**
     * 根据条件分页查找
     * @param search
     * @return
     */
    List<T> findPage(final @Param("search") T search);

    /**
     * 根据条件统计数量
     * @param search
     * @return
     */
    int countPage(final @Param("search") T search);
}
