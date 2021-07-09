package egovframework.healthper.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.healthper.service.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	private TrainerService trainerService;
	
	@RequestMapping("/trainerLogin.do")
	public String trainerLogin() {
		return "/trainer/trainerMain";
	}
	
	//트레이너 글등록페이지
	public String trainerWritePage() {
		return "";
	} 
	
	//트레이너 글등록
	public ModelAndView trainerWrite(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		
		model.addObject("result", "ok");
		return model;
	}
	
	//
	
}
