package com.kartik.service;

import com.kartik.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public boolean existEmailCheck(String email);
	
}
