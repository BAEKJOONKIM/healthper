package egovframework.healthper.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	
	@RequestMapping("/index.do")
	public String mainPage() {
		return "/common/mainPage";
	}
	
	@RequestMapping("/trainerList.do")
	public String trainerListPage() {
		System.out.println("트레이너페이지!");
		return "/common/listTrainer";
	}
	
	@RequestMapping("/centerList.do")
	public String centerListPage() {
		System.out.println("센터 페이지!");
		return "/common/listCenter";
	}
	
	@RequestMapping("/trainerDetail.do")
	public String trainerDetailPage(HttpServletRequest request) {
		System.out.println("트레이너 상세 페이지");
		return "/common/trainerDetail";
	}
	
	@RequestMapping("/centerDetail.do")
	public String centerDetailPage(HttpServletRequest request) {
		System.out.println("센터 상세 페이지");
		return "/common/centerDetail";
	}
	
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		return "/common/loginPage";
	}
	
	@RequestMapping("/ajaxLogin.do")
	public ModelAndView ajaxLogin(HttpServletRequest request){
		Map<String, Object> hashMap = new HashMap<>();
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPw");
		System.out.println(id +" "+pw);
		hashMap.put("id", id);
		hashMap.put("pw", pw);
		ModelAndView model = new ModelAndView("jsonView");
		model.addObject("user",hashMap);
		return model;
	}
	
}
