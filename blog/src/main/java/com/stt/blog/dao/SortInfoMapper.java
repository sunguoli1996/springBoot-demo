package com.stt.blog.dao;

import com.stt.blog.entity.SortInfo;
import com.stt.blog.entity.SortInfoExample;
import java.util.List;

public interface SortInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SortInfo record);

    int insertSelective(SortInfo record);

    List<SortInfo> selectByExample(SortInfoExample example);

    SortInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SortInfo record);

    int updateByPrimaryKey(SortInfo record);
}