package egovframework.healthper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.healthper.mapper.MemberMapper;
import egovframework.healthper.service.MemberService;
import egovframework.healthper.vo.MemberVO;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberVO memberLogin(MemberVO inVO) {
		
		MemberVO outVO =  memberMapper.memberLogin(inVO);
		
		return outVO;
	}

}
