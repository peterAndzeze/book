package com.book.topic.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */
//@Mapper 可以注释掉 在springboot中统一加载
public interface TopicDao {
    public Long delete(@Param("id") Long id);
}


