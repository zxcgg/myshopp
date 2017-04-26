package cn.cwx521.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.cwx521.Model.User;
import cn.cwx521.Utils.ValidatImg;
import cn.cwx521.Utils.passmd5;
import cn.cwx521.service.UserService;
import cn.cwx521.service.Imp.UserSiveImp;

@WebServlet(urlPatterns = "/user")
public class UserResignServlet extends HttpServlet
{
	private User u;
	private UserService userService;
	private passmd5 pass;
	private ValidatImg validatImg;

	@Override
	public void init() throws ServletException
	{
		u = new User();
		userService = new UserSiveImp();
		pass = new passmd5();
		validatImg = new ValidatImg();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset:UTF-8");
		Map properties = req.getParameterMap();
		String yzm = req.getParameter("yanzhengma");
		try
		{
			BeanUtils.populate(u, properties);
			u.setUpass(pass.md5(u.getUpass()));// º”√‹pass
			System.out.println(validatImg.getValidate(req, yzm));
			if (!validatImg.getValidate(req, yzm))
			{
				throw new RuntimeException();
			}
			userService.addUser(u);
		}
		catch (Exception e)
		{
			resp.getWriter().write("◊¢≤· ß∞‹");
			req.getRequestDispatcher("/WEB-INF/page/fail.jsp").forward(req, resp);
			return;
		}
		req.getRequestDispatcher("/WEB-INF/page/success.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}

}
