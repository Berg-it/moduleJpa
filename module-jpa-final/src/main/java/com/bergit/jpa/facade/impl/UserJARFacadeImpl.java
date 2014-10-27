package com.bergit.jpa.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bergit.jpa.facade.UserJARFacade;
import com.bergit.jpa.model.User;
import com.bergit.jpa.service.impl.UserJARServiceImpl;

public class UserJARFacadeImpl implements UserJARFacade {

	 @Autowired  
	 UserJARServiceImpl userJARService;  
	 
	public User getUserDetail(String userId) {
		// TODO Auto-generated method stub
		return userJARService.getUserDetails(userId);
	}

}
