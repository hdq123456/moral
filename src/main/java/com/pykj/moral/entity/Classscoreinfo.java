package com.pykj.moral.entity;

import java.util.Date;
import java.util.List;

public class Classscoreinfo {
    private Integer uid;

    private Integer classid;

    private Integer typeid;

    private String scorename;

    private Float scorevalue;

    private Integer imgeid;

    private String relaxdetail;

    private String operator;

    private Date operatdate;

    private String remark;
    
    private List<Classscoreinfo> listclassscoreinfo;
    
    public List<Classscoreinfo> getListclassscoreinfo() {
		return listclassscoreinfo;
	}

	public void setListclassscoreinfo(List<Classscoreinfo> listclassscoreinfo) {
		this.listclassscoreinfo = listclassscoreinfo;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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

    public Integer getImgeid() {
        return imgeid;
    }

    public void setImgeid(Integer imgeid) {
        this.imgeid = imgeid;
    }

    public String getRelaxdetail() {
        return relaxdetail;
    }

    public void setRelaxdetail(String relaxdetail) {
        this.relaxdetail = relaxdetail == null ? null : relaxdetail.trim();
    }
    
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperatdate() {
        return operatdate;
    }

    public void setOperatdate(Date operatdate) {
        this.operatdate = operatdate;
    }
    
    public String getRemark() {
        return remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
}