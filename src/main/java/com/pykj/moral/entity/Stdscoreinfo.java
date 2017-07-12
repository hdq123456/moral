package com.pykj.moral.entity;

import java.util.Date;
import java.util.List;

public class Stdscoreinfo {
    private Integer uid;

    private Integer studentid;

    private String typename;

    private String scorename;

    private Float scorevalue;

    private String operator;

    private Date operattime;

    private String timedec;

    private Integer courseplanid;

    private Byte effective;

    private Date effectivetime;

    private String remark;
    
    private List<Stdscoreinfo> liststdscoreinfo;
    
    public List<Stdscoreinfo> getListstdscoreinfo() {
		return liststdscoreinfo;
	}

	public void setListstdscoreinfo(List<Stdscoreinfo> liststdscoreinfo) {
		this.liststdscoreinfo = liststdscoreinfo;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
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

    public String getTimedec() {
        return timedec;
    }

    public void setTimedec(String timedec) {
        this.timedec = timedec == null ? null : timedec.trim();
    }

    public Integer getCourseplanid() {
        return courseplanid;
    }

    public void setCourseplanid(Integer courseplanid) {
        this.courseplanid = courseplanid;
    }

    public Byte getEffective() {
        return effective;
    }

    public void setEffective(Byte effective) {
        this.effective = effective;
    }

    public Date getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(Date effectivetime) {
        this.effectivetime = effectivetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}