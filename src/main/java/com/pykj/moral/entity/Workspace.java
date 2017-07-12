package com.pykj.moral.entity;

public class Workspace {
    private Integer uid;

    private String workspacecode;

    private String workspacename;

    private Integer roleid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getWorkspacecode() {
        return workspacecode;
    }

    public void setWorkspacecode(String workspacecode) {
        this.workspacecode = workspacecode == null ? null : workspacecode.trim();
    }

    public String getWorkspacename() {
        return workspacename;
    }

    public void setWorkspacename(String workspacename) {
        this.workspacename = workspacename == null ? null : workspacename.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}