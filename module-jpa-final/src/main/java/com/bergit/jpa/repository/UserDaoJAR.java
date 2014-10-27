package com.bergit.jpa.repository;

import com.bergit.jpa.model.User;


public interface UserDaoJAR {

	 public User getUserDetails(String userId);  
	 public String saveUserDetails(User user); 
	 
}
