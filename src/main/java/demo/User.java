package demo;

/**
 * @author wgf
 *
 */
/**
 * @author wgf
 *
 */
public class User {

	private int userid;
	private String username;
	private String desc;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", desc=" + desc + "]";
	}
	
	

}
