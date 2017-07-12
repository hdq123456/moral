package com.pykj.moral.entity;

public class Stdscoreset {
    private Integer scoreid;

    private Integer typeid;

    private String scorename;

    private Float scorevalue;

    private Byte effective;

    private Integer targetclass;

    private String operator;

    private String remark;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
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

    public Byte getEffective() {
        return effective;
    }

    public void setEffective(Byte effective) {
        this.effective = effective;
    }

    public Integer getTargetclass() {
        return targetclass;
    }

    public void setTargetclass(Integer targetclass) {
        this.targetclass = targetclass;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}