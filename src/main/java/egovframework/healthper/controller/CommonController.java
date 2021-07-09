package egovframework.healthper.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.healthper.service.OwnerService;
import egovframework.healthper.service.TrainerService;
import egovframework.healthper.service.MemberService;
import egovframework.healthper.vo.MemberVO;
import egovframework.healthper.vo.TrainerVO;

@Controller
public class CommonController {
	
	@Autowired
	private MemberController memberController;
	@Autowired
	private MemberService memberService;
	@Autowired
	private TrainerController trainerController;
	@Autowired
	private TrainerService trainerService;
	@Autowired
	private OwnerController onwerController;
	@Autowired
	private OwnerService ownerService;
	
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
	public ModelAndView ajaxLogin(HttpServletRequest request, HttpSession session) throws Exception{
		Map<String, Object> hashMap = new HashMap<>();
		MemberVO mVO = new MemberVO();
		TrainerVO tVO = new TrainerVO();
		ModelAndView model = new ModelAndView("jsonView");
		
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPw");
		String userKind = request.getParameter("userKind");
		if (userKind.equals("member")) {
			MemberVO inVO = new MemberVO();
			inVO.setMId(id);
			inVO.setMPw(pw);
			mVO = memberService.memberLogin(inVO);
			if(mVO != null) {
				model.addObject("sessionUser", mVO);
				model.addObject("isLogin", "S");
				model.addObject("userKind", "M");
			}else {
				model.addObject("isLogin", "F");
			}
		}else if(userKind.equals("trainer")) {
			TrainerVO inVO = new TrainerVO();
			inVO.setMId(id);
			inVO.setMPw(pw);
			tVO = trainerService.trainerLogin(inVO);
			if(tVO != null) {
				model.addObject("sessionUser", tVO);
				model.addObject("isLogin", "S");
				model.addObject("userKind", "T");
			}else {
				model.addObject("isLogin", "F");
			}
		}else if(userKind.equals("owner")){
			
		}else {
			
		}
		
		System.out.println(mVO.getMId() +" "+mVO.getMPw()+" "+userKind);
		
		return model;
	}
	
}
