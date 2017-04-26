package cn.cwx521.service;

import cn.cwx521.Model.User;

public interface UserService
{
	void addUser(User u);

	boolean validateUserExist(String username);

	boolean userQuery(String userName, String userPass);
}
