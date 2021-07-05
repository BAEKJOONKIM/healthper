package egovframework.healthper.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/memberLogin.do")
	public String userLogin(HttpServletRequest request) {
		return "/member/memberMain";
	}
	
	
}
