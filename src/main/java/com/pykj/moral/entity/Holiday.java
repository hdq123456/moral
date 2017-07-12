package com.pykj.moral.entity;

import java.util.Date;

public class Holiday {
    private Integer holidayid;

    private String holidayname;

    private String holidaydetails;

    private Date startdate;

    private Date enddate;

    public Integer getHolidayid() {
        return holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    public String getHolidayname() {
        return holidayname;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname == null ? null : holidayname.trim();
    }

    public String getHolidaydetails() {
        return holidaydetails;
    }

    public void setHolidaydetails(String holidaydetails) {
        this.holidaydetails = holidaydetails == null ? null : holidaydetails.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}