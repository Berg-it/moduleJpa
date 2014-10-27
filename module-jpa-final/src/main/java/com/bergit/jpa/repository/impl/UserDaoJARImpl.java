package com.bergit.jpa.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.bergit.jpa.model.User;
import com.bergit.jpa.repository.UserDaoJAR;

@Repository  
public class UserDaoJARImpl  implements UserDaoJAR  {

	private static final Logger logger = Logger.getLogger(UserDaoJARImpl.class);
	
	@PersistenceUnit(unitName="testspring-jpa-seconde")
    EntityManagerFactory emf;

	public User getUserDetails(String userId) {
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class,1);
		System.out.println("Name----------->"+user.getFirstname());
		return user;
	}

	public String saveUserDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
