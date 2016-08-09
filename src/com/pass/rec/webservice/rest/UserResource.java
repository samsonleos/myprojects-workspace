package com.pass.rec.webservice.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.pass.rec.dao.UserAccountInfo;
import com.pass.rec.dao.UserServiceFactory;

public class UserResource {
	
	  @Context
	  UriInfo uriInfo;
	  
	  @Context
	  Request request;
	  String id;
	  
	public UserResource(UriInfo uriInfo, Request request, String id) {
		
		this.uriInfo = uriInfo;
	    this.request = request;
	    this.id = id;
	}
	
public UserResource(UriInfo uriInfo, Request request) {
		
		this.uriInfo = uriInfo;
	    this.request = request;
	}
	
	@GET
	  @Produces(MediaType.TEXT_XML)
	  public List<UserAccountInfo> getUsersAccountHTML() {
		List<UserAccountInfo> userAccs = UserServiceFactory.getUserService().retrieveUserAccountInfo(Long.valueOf(id));
	    if(userAccs==null)
	      throw new RuntimeException("Get: User Account with " + id +  " not found");
	    return userAccs;
	  }
	
	
}
