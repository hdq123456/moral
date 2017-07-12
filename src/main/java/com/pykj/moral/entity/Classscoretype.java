package com.pykj.moral.entity;

public class Classscoretype {
    private Integer typeid;

    private String typename;

    private Integer parentid;

    private Float totalscore;

    private Integer workspaceid;

    private Byte effective;

    private String remark;

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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Float getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Float totalscore) {
        this.totalscore = totalscore;
    }

    public Integer getWorkspaceid() {
        return workspaceid;
    }

    public void setWorkspaceid(Integer workspaceid) {
        this.workspaceid = workspaceid;
    }

    public Byte getEffective() {
        return effective;
    }

    public void setEffective(Byte effective) {
        this.effective = effective;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}