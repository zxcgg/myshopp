$(function()
{
	var t = false;
	$("#user").blur(function()
	{
		$("#userspan").html("");
		if ($.trim($(this).val()) === "")
		{
			$("#userspan").html("*用户名必填且不能为空");
			$("#userspan").css("color", "red");
			t = false;
			return false;
		}
		if (!/^\w{5,10}$/.test($.trim($(this).val())))
		{
			$("#userspan").html("*用户名不得少于6位,且不能大于10位");
			$("#userspan").css("color", "red");
			t = false;
			return false;
		}
		$.ajax({
			url : rootURL + "/check",
			data : "method=uservalidate&username=" + $(this).val(),
			success : function(resp)
			{
				if (resp === "用户名可用")
				{
					$("#userspan").html(resp);
					$("#userspan").css("color", "green");
				}
				else
				{
					$("#userspan").html(resp);
					$("#userspan").css("color", "red");
					t = false;
					return false;
				}
			}
		});
		t = true;
	});
	$("#password").blur(function()
	{
		$("#passspan").html("");
		if ($.trim($(this).val()) === "")
		{
			$("#passspan").html("*密码必填且不能为空");
			$("#passspan").css("color", "red");
			t = false;
			return false;
		}
		if (!/^\w{6,10}$/.test($.trim($(this).val())))
		{
			$("#passspan").html("*用户名不得少于5位,且不能大于11位");
			$("#passspan").css("color", "red");
			t = false;
			return false;
		}
		t = true;
	});
	$("#repassword").blur(function()
	{
		$("#repassspan").html("");
		if ($.trim($(this).val()) != $("#password").val())
		{
			$("#repassspan").html("*两次输入密码不一致");
			$("#repassspan").css("color", "red");
			t = false;
			return false;
		}
		t = true;
	});
	$("#email")
			.blur(
					function()
					{
						$("#emailspan").html("");
						if ($.trim($(this).val()) === "")
						{
							$("#emailspan").html("*email不能为空");
							$("#emailspan").css("color", "red");
							t = false;
							return false;
						}
						var reg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
						if (!reg.test($.trim($(this).val())))
						{
							$("#emailspan").html("*邮箱格式不正确");
							$("#emailspan").css("color", "red");
							t = false;
							return false;
						}
						t = true;
					});
	$("#changeValidate").click(function()
	{
		$(this).css("cursor", "pointer");
		$(this).attr("src", "/image?random=" + new Date);
	});
	$("#Validate").blur(function()
	{
		$("#emailspan").html("");
		if ($.trim($(this).val()) === "")
		{
			$("#Validatespan").html("请输入验证码");
			$("#Validatespan").css("color", "red");
			t = false;
			return false;
		}
		$.ajax({
			url : rootURL + "/ValidateCheck",
			data : "validate=" + $(this).val(),
			success : function(resp)
			{
				if (resp === "验证码正确")
				{
					$("#Validatespan").html(resp);
					$("#Validatespan").css("color", "green");
				}
				else
				{
					$("#Validatespan").html(resp);
					$("#Validatespan").css("color", "red");
					t = false;
					return false;
				}
			}

		});
		t = true;
	});
	$("#zhuce").click(function()
	{
		if ((!t))
		{
			alert("请仔细检查所有输入框");
			return false;
		}
		if ($('#birth').val() == '')
		{
			alert("请选择生日");
			return false;
		}
		if ($('input:radio:checked').val() == null)
		{
			alert("请选择性别");
			return false;
		}

	});

});