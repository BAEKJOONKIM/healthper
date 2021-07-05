package egovframework.healthper.service;

import java.util.List;

import egovframework.healthper.vo.MemberVO;
import egovframework.healthper.vo.TrainerVO;

public interface MemberService {
	
	public MemberVO memberLogin(MemberVO inVO);
	
	public List<TrainerVO> memberFindTrainerList(TrainerVO inVO);
	
	
}
