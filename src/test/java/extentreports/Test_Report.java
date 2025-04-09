package extentreports;

import com.aventstack.extentreports.Status;

import org.testng.annotations.Test;

import base.BaseTest;

public class Test_Report extends BaseTest{
	
	@Test
	public void extentMethod() {
		String testCaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		
		extentlogger = extent.createTest(testCaseId, "test1 i am running");
		
		extentlogger.log(Status.PASS, "text");
		extentlogger.log(Status.FAIL, "text");
		extentlogger.log(Status.INFO, "text");

	}
}
