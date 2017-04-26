package cn.cwx521.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProperUtlis
{
	public static Properties  getProper(String name)
	{
		InputStream iStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
		Properties properties = new Properties();
		try
		{
			properties.load(iStream);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
}
