package Login.manager.impl;

import java.util.List;

import Login.dao.UserDao;
import Login.manager.UserManager;
import Login.model.User;

public class UserManagerImpl implements UserManager{
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public boolean checkUser(String name) throws Exception {
		List<User> users = userDao.findByName(name);
		if(!(users.size()>0)){
			return false;
		}
		return true;
	}

}
