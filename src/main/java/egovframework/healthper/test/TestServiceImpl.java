package egovframework.healthper.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public TestVO testLogin(TestVO vo) {
		
		return testMapper.testLogin(vo);
	}
	
}
