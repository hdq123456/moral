package com.pykj.moral.entity;

public class Stdset {
    private Integer systemsetid;

    private Integer classid;

    private String aDegree;

    private Float aDegreescore;

    private String bDegree;

    private Float bDegreescore;

    private String cDegree;

    private Float cDegreescore;

    private String dDegree;

    private Float dDegreescore;

    private String otherDegree;

    public Integer getSystemsetid() {
        return systemsetid;
    }

    public void setSystemsetid(Integer systemsetid) {
        this.systemsetid = systemsetid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getaDegree() {
        return aDegree;
    }

    public void setaDegree(String aDegree) {
        this.aDegree = aDegree == null ? null : aDegree.trim();
    }

    public Float getaDegreescore() {
        return aDegreescore;
    }

    public void setaDegreescore(Float aDegreescore) {
        this.aDegreescore = aDegreescore;
    }

    public String getbDegree() {
        return bDegree;
    }

    public void setbDegree(String bDegree) {
        this.bDegree = bDegree == null ? null : bDegree.trim();
    }

    public Float getbDegreescore() {
        return bDegreescore;
    }

    public void setbDegreescore(Float bDegreescore) {
        this.bDegreescore = bDegreescore;
    }

    public String getcDegree() {
        return cDegree;
    }

    public void setcDegree(String cDegree) {
        this.cDegree = cDegree == null ? null : cDegree.trim();
    }

    public Float getcDegreescore() {
        return cDegreescore;
    }

    public void setcDegreescore(Float cDegreescore) {
        this.cDegreescore = cDegreescore;
    }

    public String getdDegree() {
        return dDegree;
    }

    public void setdDegree(String dDegree) {
        this.dDegree = dDegree == null ? null : dDegree.trim();
    }

    public Float getdDegreescore() {
        return dDegreescore;
    }

    public void setdDegreescore(Float dDegreescore) {
        this.dDegreescore = dDegreescore;
    }

    public String getOtherDegree() {
        return otherDegree;
    }

    public void setOtherDegree(String otherDegree) {
        this.otherDegree = otherDegree == null ? null : otherDegree.trim();
    }
}