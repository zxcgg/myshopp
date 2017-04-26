package cn.cwx521.DAO.Imp;

import javax.management.RuntimeErrorException;

import org.springframework.jdbc.core.JdbcTemplate;

import cn.cwx521.DAO.UserDAO;
import cn.cwx521.Model.User;
import cn.cwx521.Utils.DataSourceHpler;
import cn.cwx521.Utils.ValidatImg;

public class USerDAOImp implements UserDAO
{
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceHpler.getIntence());

	public void addUser(User u)
	{
		String sql = "insert into user(uname,upass,ubrith,usex,uemail) value(?,?,?,?,?);";
		if (u.getUname().trim().equals("") || u.getUpass().trim().equals("") || u.getUbrith() == null
				|| u.getUsex().trim().equals("") || u.getUemail().trim().equals("") || validateUserExist(u.getUname()))
		{
			throw new RuntimeErrorException(null);
		} // Îª¿ÕÐ£Ñé

		jdbcTemplate.update(sql, u.getUname().trim(), u.getUpass(), u.getUbrith(), u.getUsex(), u.getUemail().trim());
	}

	@Override
	public boolean validateUserExist(String username)
	{
		try
		{
			String sql = "select uname from user where uname=?;";
			jdbcTemplate.queryForObject(sql, String.class, username);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}

	}

	@Override
	public boolean userQuery(String userName, String userPass)
	{
		try
		{
			String sql = "select uname,upass from user where uname=? and upass=?;";
			jdbcTemplate.queryForObject(sql, String.class, userName, userPass);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

}
