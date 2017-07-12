package com.pykj.moral.entity;

public class Illegalitem {
    private Integer scoreid;

    private String scorename;

    private Float scorevalue;

    private String remark;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}