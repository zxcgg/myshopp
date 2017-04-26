package cn.cwx521.Utils;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DataSourceHpler
{
	private static DataSource dataSource;

	private DataSourceHpler()
	{

	}

	static
	{

		if (dataSource == null)
		{
			try
			{
				dataSource = BasicDataSourceFactory.createDataSource(ProperUtlis.getProper("dbcp.properties"));
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static DataSource getIntence()
	{
		return dataSource;

	}

	public void destory()
	{
		BasicDataSource basicDataSource = (BasicDataSource) dataSource;
		try
		{
			basicDataSource.close();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
