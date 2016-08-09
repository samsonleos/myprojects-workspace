package com.pass.rec.dao;

import java.util.List;


public interface UserDAO {

	public List<User> retrieveUsers();
	
	 void saveUser(User user);
}
