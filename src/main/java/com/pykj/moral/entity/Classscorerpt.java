package com.pykj.moral.entity;

public class Classscorerpt {
    private Integer cid;

    private Integer classid;

    private Integer year;

    private Integer month;

    private Integer courseplanid;

    private String caculinfo;

    private Float caculscore;

    private String degree;

    private String remark;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
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

    public Integer getCourseplanid() {
        return courseplanid;
    }

    public void setCourseplanid(Integer courseplanid) {
        this.courseplanid = courseplanid;
    }

    public String getCaculinfo() {
        return caculinfo;
    }

    public void setCaculinfo(String caculinfo) {
        this.caculinfo = caculinfo == null ? null : caculinfo.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}