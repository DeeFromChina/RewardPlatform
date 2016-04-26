package Login.action;

import javax.annotation.Resource;

import Login.manager.UserManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String name;
	
	private String password;
	
	@Resource(name="userManager")
	private UserManager userManager;
	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception{
		try{
			userManager.checkUser(name);
			if(userManager.checkUser(name)){
				return SUCCESS;
			}else{
				return INPUT;
			}
		}catch (Exception e) {
			return ERROR;
		}
	}

}
