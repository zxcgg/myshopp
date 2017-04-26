package cn.cwx521.Utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class passmd5
{
	public String md5(String pass)
	{
		try
		{
			if (pass.trim().equals(""))
			{
				return null;
			}
			byte[] bytes = MessageDigest.getInstance("MD5").digest(pass.getBytes());
			String passmd = new BigInteger(1, bytes).toString(16);
			return passmd;
		}
		catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
