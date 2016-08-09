package com.pass.rec.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.pass.rec.dao.UserAccountInfo;
import com.pass.rec.dao.UserServiceFactory;

@WebService(endpointInterface="com.pass.rec.webservice.UserWebService")
public class UserWebServiceImpl implements UserWebService{

	@Override
	@WebMethod
	public List<UserAccountInfo> retrieveAccountInfo(Long userId) {
		return UserServiceFactory.getUserService().retrieveUserAccountInfo(userId);
	}

}
