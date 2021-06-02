package egovframework.healthper.test;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("testMapper")
public interface TestMapper {
	
	public TestVO testLogin(TestVO vo);
	
}
