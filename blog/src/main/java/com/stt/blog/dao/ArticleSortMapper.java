package com.stt.blog.dao;

import com.stt.blog.entity.ArticleSort;
import com.stt.blog.entity.ArticleSortExample;
import java.util.List;

public interface ArticleSortMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleSort record);

    int insertSelective(ArticleSort record);

    List<ArticleSort> selectByExample(ArticleSortExample example);

    ArticleSort selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleSort record);

    int updateByPrimaryKey(ArticleSort record);
}