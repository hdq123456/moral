package com.pykj.moral.entity;

public class Rptmonthset {
    private Integer sid;

    private Byte isovermonth;

    private Integer startday;

    private Integer endday;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Byte getIsovermonth() {
        return isovermonth;
    }

    public void setIsovermonth(Byte isovermonth) {
        this.isovermonth = isovermonth;
    }

    public Integer getStartday() {
        return startday;
    }

    public void setStartday(Integer startday) {
        this.startday = startday;
    }

    public Integer getEndday() {
        return endday;
    }

    public void setEndday(Integer endday) {
        this.endday = endday;
    }
}