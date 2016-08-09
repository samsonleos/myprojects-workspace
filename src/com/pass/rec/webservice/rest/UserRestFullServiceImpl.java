package com.pass.rec.webservice.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.pass.rec.dao.UserAccountInfo;
import com.pass.rec.dao.UserServiceFactory;

@Path("/users")
public class UserRestFullServiceImpl implements UserRestFullService{

	@Context
	UriInfo uriInfo;
	
	@Context
	Request request;
	/*
	 * (non-Javadoc)
	 * @see com.pass.rec.webservice.rest.UserRestFullService#retrieveAccountInfo(java.lang.Long)
	 */
	@Override
	@GET
	  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<UserAccountInfo> retrieveAccountInfo(Long userId) {
		return UserServiceFactory.getUserService().retrieveUserAccountInfo(userId);
	}

	/*
	 * (non-Javadoc)
	 * @see com.pass.rec.webservice.rest.UserRestFullService#retrieveAllAccountInfo()
	 */
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("all")
	@Override
	public List<UserAccountInfo> retrieveAllAccountInfo() {
		return UserServiceFactory.getUserService().findAllUserAccInfo();
	}

	@Path("{userid}")
	public UserResource getUser(@PathParam("userid") String id){
		return new UserResource(uriInfo, request, id);
	}
	
	
}
