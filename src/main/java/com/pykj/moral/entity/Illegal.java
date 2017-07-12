package com.pykj.moral.entity;

import java.util.Date;

public class Illegal {
    private Integer illegalid;

    private Integer itemid;

    private Integer studentid;

    private String scorename;

    private Integer imageid;

    private Float scorevalue;

    private String operator;

    private Date operatortime;

    private String remark;

    private Integer dormid;

    private Integer year;

    private Integer month;

    private String studentinfo;

    public Integer getIllegalid() {
        return illegalid;
    }

    public void setIllegalid(Integer illegalid) {
        this.illegalid = illegalid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getScorename() {
        return scorename;
    }

    public void setScorename(String scorename) {
        this.scorename = scorename == null ? null : scorename.trim();
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public Float getScorevalue() {
        return scorevalue;
    }

    public void setScorevalue(Float scorevalue) {
        this.scorevalue = scorevalue;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(Date operatortime) {
        this.operatortime = operatortime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getStudentinfo() {
        return studentinfo;
    }

    public void setStudentinfo(String studentinfo) {
        this.studentinfo = studentinfo == null ? null : studentinfo.trim();
    }
}