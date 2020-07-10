package com.students.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class LogIn {
	@ResponseBody
	@RequestMapping("/login")
	public String hi() {
		return "login.jsp";
	}
}
