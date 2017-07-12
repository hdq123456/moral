package com.pykj.moral.entity;

import java.util.Date;

public class Shiftset {
    private Integer shiftid;

    private String shiftname;

    private Date starttime;

    private Date endtime;

    private Byte effective;

    public Integer getShiftid() {
        return shiftid;
    }

    public void setShiftid(Integer shiftid) {
        this.shiftid = shiftid;
    }

    public String getShiftname() {
        return shiftname;
    }

    public void setShiftname(String shiftname) {
        this.shiftname = shiftname == null ? null : shiftname.trim();
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

    public Byte getEffective() {
        return effective;
    }

    public void setEffective(Byte effective) {
        this.effective = effective;
    }
}