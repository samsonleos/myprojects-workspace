package com.pass.rec.webservice;

import javax.xml.ws.Endpoint;

import com.pass.rec.dao.UserServiceImpl;

public class WebServicePublisher {
	
	public static void main (String args[]){
		Endpoint.publish("http://localhost:8080/user/ws/accountinfo", new UserServiceImpl());
	}

}
