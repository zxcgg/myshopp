package cn.cwx521.service.Imp;

import cn.cwx521.DAO.UserDAO;
import cn.cwx521.DAO.Imp.USerDAOImp;
import cn.cwx521.Model.User;
import cn.cwx521.service.UserService;

public class UserSiveImp implements UserService
{

	private UserDAO uDao = new USerDAOImp();

	@Override
	public void addUser(User u)
	{
		uDao.addUser(u);

	}

	@Override
	public boolean validateUserExist(String username)
	{
		
		return uDao.validateUserExist(username);
	}

	@Override
	public boolean userQuery(String userName, String userPass)
	{
		return uDao.userQuery(userName,userPass);
	}

}
