package egovframework.healthper.test;


public class TestVO {
	private String testId;
	private String testPw;
	
	public TestVO() {
		super();
	}

	public TestVO(String testId, String testPw) {
		super();
		this.testId = testId;
		this.testPw = testPw;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestPw() {
		return testPw;
	}

	public void setTestPw(String testPw) {
		this.testPw = testPw;
	}
	
	
	
}
