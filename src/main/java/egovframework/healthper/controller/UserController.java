package egovframework.healthper.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/userLogin.do")
	public String userLogin(HttpServletRequest request) {
		return "userPage";
	}
}
