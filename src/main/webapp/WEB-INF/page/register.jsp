<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
<script type="text/javascript">
	var rootURL = "${pageContext.servletContext.contextPath}";
</script>
<script type="text/javascript" src="js/register.js">
	
</script>

<title>注册</title>
</head>
<body>

	<form action="${pageContext.servletContext.contextPath}/user"
		id="register" method="post">
		<div id="father">
			<div id="form2">
				<table border="0px" width="100%" height="100%" align="center"
					cellpadding="0px" cellspacing="0px" bgcolor="white">
					<tr>
						<td colspan="2">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font
							size="5">会员注册</font>&nbsp;&nbsp;&nbsp;USER REGISTER
						</td>
					</tr>
					<tr>
						<td width="180px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <label
							for="user">用户名</label>
						</td>
						<td><em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input
							type="text" name="uname" size="35px" id="user" /> <span id="userspan"></span>    </td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 密码</td>
						<td><em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input
							type="password" name="upass" size="35px" id="password" /><span id="passspan"></span> </td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 确认密码</td>
						<td><em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input
							type="password" name="repassword" size="35px" id="repassword" /><span id="repassspan"></span> </td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Email</td>
						<td><em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input
							type="email" name="uemail" size="35px" id="email" /> <span id="emailspan"></span></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 性别</td>
						<td><span style="margin-right: 155px;"> <em
								style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input type="radio"
								name="usex" value="男" />男 <input type="radio" name="usex"
								value="女" />女<em></em> <label for="sex" class="error"
								style="display: none;"></label>
						</span></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 出生日期</td>
						<td><em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input
							type="date" name="ubrith" size="35px" id="brith" /></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 验证码</td>
						<td><em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input
							type="text" name="yanzhengma" id="Validate" /><span id="Validatespan"></span><a><img src="${pageContext.servletContext.contextPath}/image"  id="changeValidate" /></a>  </td>
					</tr>
					<tr>
						<td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit"
							value="注      册" class="btn btn-primary" height="50px" id="zhuce" />
						</td>
					</tr>
				</table>
			</div>
		</div>
	</form>

</body>
</html>