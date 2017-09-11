package com.book.common.model;

import java.time.LocalDateTime;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */
public class BaseModel {
    private LocalDateTime creatTime;
    private LocalDateTime operateTime;
    private String state;
    private String remark;

    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
