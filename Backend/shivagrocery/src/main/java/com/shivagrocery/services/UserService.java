package com.shivagrocery.services;

import com.shivagrocery.entity.User;

public interface UserService {

	int createprofile(User user);

	User viewUserProfile(User u);

	boolean editUserProfile(User user);

	boolean deleteUserProfile(String email);
	public boolean  FindbyIdandPwd(String email, String password);

}
