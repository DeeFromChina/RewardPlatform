package Login.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 4227221156088030280L;

	private Integer id;
	
	private String userName;
	
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
