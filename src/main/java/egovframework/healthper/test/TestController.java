package egovframework.healthper.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/testPage.do")
	public String testPage() {
		return "testPage";
	}
	
	@RequestMapping("/testLogin.do")
	public String testLogin(HttpServletRequest request) {
		
		System.out.println("id : " + request.getParameter("testId"));
		System.out.println("pw : " + request.getParameter("testPw"));
		TestVO vo = new TestVO(request.getParameter("testId"), request.getParameter("testPw"));
		
		TestVO resultVo = testService.testLogin(vo);
		if(resultVo==null) {
			return "loginFail";
		}else {
			return "testLogin";
		}
	}
}
