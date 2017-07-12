package com.pykj.moral.entity;

public class Relaxscore {
    private Integer detailid;

    private String scorename;

    private Float scorevalue;

    private Integer scoreitemid;

    private Byte effective;

    private String operator;

    private String remark;

    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
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

    public Integer getScoreitemid() {
        return scoreitemid;
    }

    public void setScoreitemid(Integer scoreitemid) {
        this.scoreitemid = scoreitemid;
    }

    public Byte getEffective() {
        return effective;
    }

    public void setEffective(Byte effective) {
        this.effective = effective;
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