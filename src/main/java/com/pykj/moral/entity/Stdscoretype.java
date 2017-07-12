package com.pykj.moral.entity;

public class Stdscoretype {
    private Integer typeid;

    private String typename;

    private String remark;

    private Byte isedit;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getIsedit() {
        return isedit;
    }

    public void setIsedit(Byte isedit) {
        this.isedit = isedit;
    }
}