package egovframework.healthper.mapper;

import java.util.List;

import egovframework.healthper.vo.MemberVO;
import egovframework.healthper.vo.TrainerVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("memberMapper")
public interface MemberMapper {
	
	public MemberVO memberLogin(MemberVO inVO);
	
	public List<TrainerVO> memberFindTrainerList(TrainerVO inVO);
	
}
