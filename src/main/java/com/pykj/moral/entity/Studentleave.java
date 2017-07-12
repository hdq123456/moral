package com.pykj.moral.entity;

import java.util.Date;

public class Studentleave {
    private Integer leaveid;

    private String leavetype;

    private String leavereason;

    private String leavemancode;

    private String leaveman;

    private Date starttime;

    private Date endtime;

    private Date applytime;

    private String fileids;

    private String status;

    private String remark;

    private String instancecode;

    public Integer getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(Integer leaveid) {
        this.leaveid = leaveid;
    }

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype == null ? null : leavetype.trim();
    }

    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason == null ? null : leavereason.trim();
    }

    public String getLeavemancode() {
        return leavemancode;
    }

    public void setLeavemancode(String leavemancode) {
        this.leavemancode = leavemancode == null ? null : leavemancode.trim();
    }

    public String getLeaveman() {
        return leaveman;
    }

    public void setLeaveman(String leaveman) {
        this.leaveman = leaveman == null ? null : leaveman.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getFileids() {
        return fileids;
    }

    public void setFileids(String fileids) {
        this.fileids = fileids == null ? null : fileids.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInstancecode() {
        return instancecode;
    }

    public void setInstancecode(String instancecode) {
        this.instancecode = instancecode == null ? null : instancecode.trim();
    }
}