package com.pass.rec.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.pass.rec.dao.UserAccountInfo;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface UserWebService {

	@WebMethod
	public List<UserAccountInfo>retrieveAccountInfo(Long userId);
	
}
