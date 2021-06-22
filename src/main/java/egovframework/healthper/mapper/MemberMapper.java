package egovframework.healthper.mapper;

import egovframework.healthper.vo.MemberVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("memberMapper")
public interface MemberMapper {
	
	public MemberVO memberLogin(MemberVO inVO);
}
