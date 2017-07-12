package com.pykj.moral.entity;

import java.util.Date;

public class Attendschoolrpt {
    private Integer rptid;

    private Integer leavecount;

    private Integer delaycount;

    private Integer earlycount;

    private Date operatdate;

    private Integer courseplanid;

    private Integer month;

    public Integer getRptid() {
        return rptid;
    }

    public void setRptid(Integer rptid) {
        this.rptid = rptid;
    }

    public Integer getLeavecount() {
        return leavecount;
    }

    public void setLeavecount(Integer leavecount) {
        this.leavecount = leavecount;
    }

    public Integer getDelaycount() {
        return delaycount;
    }

    public void setDelaycount(Integer delaycount) {
        this.delaycount = delaycount;
    }

    public Integer getEarlycount() {
        return earlycount;
    }

    public void setEarlycount(Integer earlycount) {
        this.earlycount = earlycount;
    }

    public Date getOperatdate() {
        return operatdate;
    }

    public void setOperatdate(Date operatdate) {
        this.operatdate = operatdate;
    }

    public Integer getCourseplanid() {
        return courseplanid;
    }

    public void setCourseplanid(Integer courseplanid) {
        this.courseplanid = courseplanid;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}