package Login.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Login.dao.UserDao;
import Login.model.User;

public class UserDaoimpl extends HibernateDaoSupport implements UserDao{

	public User getUser(Serializable name) throws Exception {
		String hql="FROM User user WHERE user.userName='"+name+"'";
		User user = new User();
		return user;
	}

	public List<User> findByName(String name) throws Exception{
		String hql="FROM User user WHERE user.userName='"+name+"'";
		List<User> users = getHibernateTemplate().find(hql);
		return users;
	}
}
