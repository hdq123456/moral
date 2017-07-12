package com.pykj.moral.entity;

import java.util.Date;

public class Dormscorerpt {
    private Integer cid;

    private Integer dormid;

    private Integer year;

    private Integer month;

    private Date caculdate;

    private Float caculscore;

    private String degree;

    private Integer isillegal;

    private String remark;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getDormid() {
        return dormid;
    }

    public void setDormid(Integer dormid) {
        this.dormid = dormid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Date getCaculdate() {
        return caculdate;
    }

    public void setCaculdate(Date caculdate) {
        this.caculdate = caculdate;
    }

    public Float getCaculscore() {
        return caculscore;
    }

    public void setCaculscore(Float caculscore) {
        this.caculscore = caculscore;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public Integer getIsillegal() {
        return isillegal;
    }

    public void setIsillegal(Integer isillegal) {
        this.isillegal = isillegal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}