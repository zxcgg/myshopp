package cn.cwx521.Model;

import java.sql.Date;

public class User
{
	private int uid;
	private String uname;
	private String upass;
	private Date ubrith;
	private String usex;
	private String uemail;

	public User()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, String upass, Date ubrith, String usex, String uemail)
	{
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.ubrith = ubrith;
		this.usex = usex;
		this.uemail = uemail;
	}

	public int getUid()
	{
		return uid;
	}

	public void setUid(int uid)
	{
		this.uid = uid;
	}

	public String getUname()
	{
		return uname;
	}

	public void setUname(String uname)
	{
		this.uname = uname;
	}

	public String getUpass()
	{
		return upass;
	}

	public void setUpass(String upass)
	{
		this.upass = upass;
	}

	public Date getUbrith()
	{
		return ubrith;
	}

	public void setUbrith(Date ubrith)
	{
		this.ubrith = ubrith;
	}

	public String getUsex()
	{
		return usex;
	}

	public void setUsex(String usex)
	{
		this.usex = usex;
	}

	public String getUemail()
	{
		return uemail;
	}

	public void setUemail(String uemail)
	{
		this.uemail = uemail;
	}

	@Override
	public String toString()
	{
		return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", ubrith=" + ubrith + ", usex=" + usex
				+ ", uemail=" + uemail + "]";
	}

}
