package com.pykj.moral.entity;

import java.util.Date;

public class Stdscorerpt {
    private Long cid;

    private Integer studentid;

    private Integer courseplanid;

    private Date caculdate;

    private Float caculscore;

    private String degree;

    private String comment;

    private String remark;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getCourseplanid() {
        return courseplanid;
    }

    public void setCourseplanid(Integer courseplanid) {
        this.courseplanid = courseplanid;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}