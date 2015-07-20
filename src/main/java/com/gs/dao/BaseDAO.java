package com.gs.dao;

import com.gs.common.bean.Pager;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WangGenshen on 7/17/15.
 */
public interface BaseDAO<T, PK extends Serializable> {

    /**
     * 插入一条记录
     * @param t
     * @return
     */
    public int insert(T t);
    public int batchInsert(List<T> list);
    public int delete(T t);
    public int deleteById(PK id);
    public int batchDelete(List<T> list);
    public int update(T t);
    public int updateById(PK id);
    public int batchUpdate(List<T> list);
    public List<T> query();
    public T queryById(PK id);
    public List<T> queryByPager(Pager pager);
    public int count();

}
