package egovframework.healthper.service;

import egovframework.healthper.vo.TrainerVO;

public interface TrainerService {
	
	public TrainerVO trainerLogin(TrainerVO inVO) throws Exception; 
	
	public String trainerWrite(TrainerVO inVO) throws Exception;
}
