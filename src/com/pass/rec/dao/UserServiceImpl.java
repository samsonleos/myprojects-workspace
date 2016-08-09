package com.pass.rec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private UserAccountInfoDAO userAccInfoDao;
	
	@Autowired
	private AccountTypeDAO accountTypeDAO;
	
	@Override
	public User findById(int id) {
		return null;
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.retrieveUsers();
	}

	@Override
	public void saveUserAccInfo(UserAccountInfo userInfo) {
		userAccInfoDao.saveAccountInfo(userInfo);
	}

	@Override
	public List<UserAccountInfo> findAllUserAccInfo() {
		return userAccInfoDao.retrieveUserAccountInfo();
	}
	
	@Override
	public List<AccountType> retrieveAccountType() {
		return accountTypeDAO.retrieveAccountTypes();
	}

	@Override
	public List<UserAccountInfo> retrieveUserAccountInfo(Long userId) {
		return userAccInfoDao.retrieveUserAccountInfo(userId);
	}
}
