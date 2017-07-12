package com.pykj.moral.entity;

import java.util.Date;

public class Attendschool {
    private Integer attendid;

    private Integer studentid;

    private String statename;

    private String statedesc;

    private Date operattime;

    public Integer getAttendid() {
        return attendid;
    }

    public void setAttendid(Integer attendid) {
        this.attendid = attendid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename == null ? null : statename.trim();
    }

    public String getStatedesc() {
        return statedesc;
    }

    public void setStatedesc(String statedesc) {
        this.statedesc = statedesc == null ? null : statedesc.trim();
    }

    public Date getOperattime() {
        return operattime;
    }

    public void setOperattime(Date operattime) {
        this.operattime = operattime;
    }
}