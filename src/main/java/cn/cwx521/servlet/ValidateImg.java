package cn.cwx521.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/image")
public class ValidateImg extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session = req.getSession();
		BufferedImage bImage = new BufferedImage(90, 30, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bImage.getGraphics();
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, 90, 30);
		String string = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASADFGHJKLZXCVBNM";
		char[] strs = string.toCharArray();
		Font font = new Font("Fixedsys", Font.BOLD, 20);
		graphics.setFont(font);
		graphics.setColor(Color.WHITE);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++)
		{
			char c = strs[new Random().nextInt(strs.length)];
			sb.append(c);
			graphics.drawString(c + "", i * 20 + 10, 20);// 4个数
		}
		session.setAttribute("yanzhengma", sb.toString());
		System.out.println(sb.toString());
		resp.setContentType("image/jpg");
		graphics.dispose();// 释放资源
		ImageIO.write(bImage, "jpg", resp.getOutputStream());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}

}
