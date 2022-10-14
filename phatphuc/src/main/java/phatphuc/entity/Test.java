package phatphuc.entity;

import java.util.Date;

public class Test {
	private String testId;
	private String result;
	private Date date;
	private String testType;
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", result=" + result + ", date=" + date + ", testType=" + testType + "]";
	}
	
	
	
}
