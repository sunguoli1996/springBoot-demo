package com.stt.blog.dao;

import com.stt.blog.entity.ArticleMessage;
import com.stt.blog.entity.ArticleMessageExample;
import java.util.List;

public interface ArticleMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleMessage record);

    int insertSelective(ArticleMessage record);

    List<ArticleMessage> selectByExample(ArticleMessageExample example);

    ArticleMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleMessage record);

    int updateByPrimaryKey(ArticleMessage record);
}