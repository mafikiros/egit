package com.user.Login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LoginModel {

	public String getType(String login, String paswd) {
		System.out.println(login+"..,"+paswd);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("custentity");
		EntityManager em= emf.createEntityManager();
		userEntity ce= em.find(userEntity.class, login);
		System.out.println(ce);
		return null;
	}

}
