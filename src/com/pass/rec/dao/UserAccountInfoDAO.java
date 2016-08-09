package com.pass.rec.dao;

import java.util.List;

public interface UserAccountInfoDAO {

	public List<UserAccountInfo> retrieveUserAccountInfo();
	public void saveAccountInfo(UserAccountInfo info);
	
	public List<UserAccountInfo> retrieveUserAccountInfo(Long userId);
	
}
