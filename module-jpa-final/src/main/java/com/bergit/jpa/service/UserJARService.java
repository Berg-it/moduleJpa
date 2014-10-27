package com.bergit.jpa.service;

import com.bergit.jpa.model.User;


public interface UserJARService {
	 public User getUserDetails(String userId);  
	 public String saveUserDetails(User user);  
}
