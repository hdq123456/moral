package com.pykj.moral.entity;

import java.util.Date;

public class Handlerecord {
    private Integer rid;

    private Integer classid;

    private Date operattime;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Date getOperattime() {
        return operattime;
    }

    public void setOperattime(Date operattime) {
        this.operattime = operattime;
    }
}