package com.pass.rec.dao;

public class UserServiceFactory {
	
	private static UserService userService;
	
	public static UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		UserServiceFactory.userService = userService;
	}

}
