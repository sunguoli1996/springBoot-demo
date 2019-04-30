package com.stt.blog.dao;

import com.stt.blog.entity.Message;
import com.stt.blog.entity.MessageExample;
import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}