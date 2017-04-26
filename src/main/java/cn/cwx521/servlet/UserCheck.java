package cn.cwx521.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cwx521.service.UserService;
import cn.cwx521.service.Imp.UserSiveImp;

@WebServlet(urlPatterns = "/check")
public class UserCheck extends HttpServlet
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
		if (req.getParameter("method") != null && (req.getParameter("method").equals("uservalidate")))
		{
			String username = req.getParameter("username");
			boolean b = us.validateUserExist(username);// �첽У��
			resp.getWriter().write(b ? "�û����Ѵ���" : "�û�������");
			return;
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}

}
