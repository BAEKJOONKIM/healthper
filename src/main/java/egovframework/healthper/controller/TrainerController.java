package egovframework.healthper.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.healthper.service.TrainerService;
import egovframework.healthper.vo.BoardVO;
import egovframework.healthper.vo.TrainerVO;

@Controller
public class TrainerController {
	
	@Autowired
	private TrainerService trainerService;
	
	@RequestMapping("/trainerLogin.do")
	public String trainerLogin() {
		return "/trainer/trainerMain";
	}
	
	@RequestMapping("/trainerMenu.do")
	public String trainerMenu() {
		return "/trainer/trainerMenu";
	}
	
	//트레이너 글등록페이지
	@RequestMapping("/trainerWrite.do")
	public String trainerWritePage() {
		return "/trainer/trainerWrite";
	} 
	
	//트레이너 글등록
	@RequestMapping("/trainerWriteAction.do")
	public ModelAndView trainerWriteAction(HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView();
		BoardVO inVO = new BoardVO();
		String result = trainerService.trainerWriteAction(inVO);
		
		if(result.equals("S")) {
			model.addObject("result", "S");
		}else {
			model.addObject("result", "F");
		}
	
		return model;
	}
	
	//
	
}
