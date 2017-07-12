package com.pykj.moral.entity;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Dormscoreinfo {

    private Integer uid;

    private Integer dormid;

    private String scorename;

    private Float scorevalue;

    private String image;

    private String reason;

    private String operator;

    private Date operattime;

    private String remark;

    private Integer studentid;

    private String studentinfo;
    
    private List<Dormscoreinfo> listdormscoreinfo;
    
    public List<Dormscoreinfo> getListdormscoreinfo() {
		return listdormscoreinfo;
	}

	public void setListdormscoreinfo(List<Dormscoreinfo> listdormscoreinfo) {
		this.listdormscoreinfo = listdormscoreinfo;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDormid() {
        return dormid;
    }

    public void setDormid(Integer dormid) {
        this.dormid = dormid;
    }

    public String getScorename() {
        return scorename;
    }

    public void setScorename(String scorename) {
        this.scorename = scorename == null ? null : scorename.trim();
    }

    public Float getScorevalue() {
        return scorevalue;
    }

    public void setScorevalue(Float scorevalue) {
        this.scorevalue = scorevalue;
    }

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperattime() {
        return operattime;
    }

    public void setOperattime(Date operattime) {
        this.operattime = operattime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentinfo() {
        return studentinfo;
    }

    public void setStudentinfo(String studentinfo) {
        this.studentinfo = studentinfo == null ? null : studentinfo.trim();
    }
}