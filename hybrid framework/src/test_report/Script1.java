package test_report;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Script1 {
	@Test
	public void test1()
	{
	  ExtentReports rep = new ExtentReports("./report/r.html");
	  ExtentTest t1 = rep.startTest("tc1");
	  t1.log(LogStatus.PASS,"passed");
	  t1.log(LogStatus.FAIL, "failed");
	  t1.log(LogStatus.SKIP, "skiped");
	  rep.endTest(t1);
	  rep.flush();
	}
	

}
