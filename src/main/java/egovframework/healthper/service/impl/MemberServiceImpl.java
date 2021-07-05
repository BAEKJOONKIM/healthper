package egovframework.healthper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.healthper.mapper.MemberMapper;
import egovframework.healthper.service.MemberService;
import egovframework.healthper.vo.MemberVO;
import egovframework.healthper.vo.TrainerVO;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberVO memberLogin(MemberVO inVO) {
		
		MemberVO outVO =  memberMapper.memberLogin(inVO);
		
		return outVO;
	}

	//트레이너 리스트 조회
	@Override
	public List<TrainerVO> memberFindTrainerList(TrainerVO inVO) {
		
		List<TrainerVO> outVO = memberMapper.memberFindTrainerList(inVO);
		
		return null;
	}

}
