package cn.cwx521.DAO;

import cn.cwx521.Model.User;

public interface UserDAO
{
	void addUser(User u);

	boolean validateUserExist(String username);

	boolean userQuery(String userName, String userPass);
}
