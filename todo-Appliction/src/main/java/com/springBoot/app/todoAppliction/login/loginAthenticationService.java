package com.springBoot.app.todoAppliction.login;

import org.springframework.stereotype.Service;

@Service
public class loginAthenticationService {

	
	public boolean loginAthentication(String name, String password) {
		boolean nameAthen=name.equalsIgnoreCase("gani");
		boolean passAthen=password.equalsIgnoreCase("gani");
		return nameAthen && passAthen;
	}
}
