package com.pykj.moral.entity;

import java.util.Date;

public class Files {
	
    private Integer id;

    private String filename;

    private Integer size;

    private String url;

    private Date createtion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreatetion() {
        return createtion;
    }

    public void setCreatetion(Date createtion) {
        this.createtion = createtion;
    }
}