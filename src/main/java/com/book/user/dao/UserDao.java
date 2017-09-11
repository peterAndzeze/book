package com.book.user.dao;

import com.book.user.model.UserModel;
import org.apache.ibatis.annotations.*;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */
@Mapper
public interface UserDao {
    public Long delete(@Param("id") Long id);

    /**
     * 查询
     * @param id
     * @return
     */
    @Select("select * from tp_user_info where id=#{id}")
    @ResultType(com.book.user.model.UserModel.class)
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "user_name", property = "userName")
            })

    public UserModel getUserModel(Long id);
}
