package com.pykj.moral.entity;

import java.util.Date;
import java.util.UUID;

public class Uploadfile {

	private Integer id;
	private String filename;
	private String url;
	private int size;
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

	public void setFilename(String profix, String fileName) {
		if (fileName != null && fileName.indexOf(".") > 0) {
			fileName = (profix != null ? "/" + profix + "/" : "") + UUID.randomUUID().toString()
					+ fileName.substring(fileName.indexOf("."), fileName.length());
		}
		this.filename = fileName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Date getCreatetion() {
		return createtion;
	}

	public void setCreatetion(Date createtion) {
		this.createtion = createtion;
	}

}
