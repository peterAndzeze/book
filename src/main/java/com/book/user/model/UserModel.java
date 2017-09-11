package com.book.user.model;

import com.book.common.model.BaseModel;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */

public class UserModel extends BaseModel {
    private Long id;
    private String userName;
    private String userPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
