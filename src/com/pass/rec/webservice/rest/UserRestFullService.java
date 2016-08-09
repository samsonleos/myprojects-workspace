package com.pass.rec.webservice.rest;

import java.util.List;

import com.pass.rec.dao.UserAccountInfo;

public interface UserRestFullService {

	public List<UserAccountInfo>retrieveAccountInfo(Long userId);
	public List<UserAccountInfo>retrieveAllAccountInfo();
}
