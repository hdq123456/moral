package com.pykj.moral.entity;

import java.util.List;

public class Dormregion {

	private Integer regionid;

	private String regionname;

	private Integer parentid;

	private String remark;

	private List<Dormregion> listdormregion;

	public List<Dormregion> getListdormregion() {
		return listdormregion;
	}
	
	public void setListdormregion(List<Dormregion> listdormregion) {
		this.listdormregion = listdormregion;
	}

	public Integer getRegionid() {
		return regionid;
	}

	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname == null ? null : regionname.trim();
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
	
}