package egovframework.healthper.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.healthper.service.TrainerService;

@Controller
public class MemberController {
	
	@RequestMapping("/memberLogin.do")
	public String userLogin(HttpServletRequest request) {
		return "/member/memberMain";
	}
	
	@RequestMapping("/memberTrainerList.do")
	public String  memberTrainerListPage() {
		return "/member/listCenter";
	}
	
	@RequestMapping("/memberCenterList.do")
	public String memberCenterListPage() {
		return "/member/listTrainer";
	}
	
	@RequestMapping("/memberFindTrainerList")
	public ModelAndView memberFindTrainerList(HttpServletRequest request) {
		ModelAndView model = new ModelAndView(); 
		
		return model;
	}
}
