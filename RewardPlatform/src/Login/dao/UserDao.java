package Login.dao;

import java.io.Serializable;
import java.util.List;

import Login.model.User;

public interface UserDao {
	public User getUser(Serializable id) throws Exception;
	public List<User> findByName(String name) throws Exception;
}
