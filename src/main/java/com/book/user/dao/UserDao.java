package com.book.user.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */
@Mapper
public interface UserDao {
    public Long delete(@Param("id") Long id);
}
