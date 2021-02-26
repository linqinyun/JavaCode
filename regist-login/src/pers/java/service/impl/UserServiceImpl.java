package pers.java.service.impl;

import java.util.List;

import pers.java.domain.User;
import pers.java.service.UserService;

public class UserServiceImpl implements UserService {
	@Override
	public void regist(List<User> userList, User user) {
		userList.add(user);
	}
	@Override
	public User login(List<User> userList, User user) {
		for(User existUser:userList) {
			if(existUser.getUsername().equals(user.getUsername())&&existUser.getPassword().equals(user.getPassword())) {
				return existUser;
			}
		}
		return null;
	}

}
