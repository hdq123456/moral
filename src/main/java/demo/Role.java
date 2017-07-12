package demo;

/**
 * @author wgf
 *
 */
public class Role {

	private Integer roleid;
	private String name;
	private String desc;
	private String remark;
	private User user;

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role() {

	}

	public Role(int roleid, String name, String desc, String remark) {
		super();
		this.roleid = roleid;
		this.name = name;
		this.desc = desc;
		this.remark = remark;
	}
	
}
