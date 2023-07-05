package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_script.Framework_const;

public class Basescript
{
	@Test
	System.setProperty("webdriver.chrome.driver","./Softwares/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver
	driver.get("https://demoqa.com/automation-practice-form");
	//lunch the browser
	
	
	

}
