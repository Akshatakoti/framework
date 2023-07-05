package test_script;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_script.Generic_script_testng;
import pom_script.pom1;

public class Script1 extends Generic_script_testng {
	@Test
	public void test1(String d1 String d2)
	{
		pom1 p=new pom1(driver);
		p.passUN(d1);
		p.passpwd(d2);
		Thread.sleep(2000);
		p.btn();
		Assert.fail();			
	}

}
