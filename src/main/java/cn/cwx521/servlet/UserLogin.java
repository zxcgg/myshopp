package cn.cwx521.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cwx521.service.UserService;
import cn.cwx521.service.Imp.UserSiveImp;

@WebServlet(urlPatterns = "/userlogin")
public class UserLogin extends HttpServlet
{
	private UserService us;

	@Override
	public void init() throws ServletException
	{
		us = new UserSiveImp();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String userName = req.getParameter("username");
		String userPass = req.getParameter("userpass");
		if (!us.validateUserExist(userName))
		{
			req.getRequestDispatcher("/WEB-INF/page/fail.jsp").forward(req, resp);
			return;
		}
		us.userQuery(userName, userPass);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}

}
