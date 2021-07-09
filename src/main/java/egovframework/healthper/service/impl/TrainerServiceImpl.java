package egovframework.healthper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.healthper.mapper.TrainerMapper;
import egovframework.healthper.service.TrainerService;
import egovframework.healthper.vo.TrainerVO;

@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	private TrainerMapper trainerMapper;
	
	@Override
	public TrainerVO trainerLogin(TrainerVO inVO) throws Exception {
		TrainerVO outVO = new TrainerVO();
		outVO = trainerMapper.trainerLogin(inVO);
		return outVO;
	}
	
	@Override
	public String trainerWrite(TrainerVO inVO) throws Exception {
		
		
		
		return "";
	}

	
	
}
