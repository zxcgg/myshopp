package cn.cwx521.Utils;

import javax.servlet.http.HttpServletRequest;

public class ValidatImg
{
	private boolean b=false;

	public boolean getValidate(HttpServletRequest req)
	{

		String validate = req.getParameter("validate");// �ͻ���
		String Validate = (String) req.getSession().getAttribute("yanzhengma");// �����
		b = validate.equals(Validate);
		return b;
	}

	public boolean getValidate(HttpServletRequest req,String str)
	{
		
		String Validate = (String) req.getSession().getAttribute("yanzhengma");// �����
		b = str.equals(Validate);
		return b;

	}
}
