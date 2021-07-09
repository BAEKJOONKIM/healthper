package egovframework.healthper.mapper;

import egovframework.healthper.vo.TrainerVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface TrainerMapper {

	//트레이너 로그인
	public TrainerVO trainerLogin(TrainerVO inVO); 
	
	//트레이너 글등록
	public int trainerWrite(TrainerVO inVO);
}
