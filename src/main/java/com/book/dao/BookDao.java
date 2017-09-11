package com.book.dao;

import com.book.model.BookModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */
@Mapper
public interface BookDao {
    @Select("select * from tb_book where id=#{id}")
    public BookModel getBookById(Long id);
}
