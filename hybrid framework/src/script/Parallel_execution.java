package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallel_execution {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
		public void exec(String browser) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/login/");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8792968665");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshata@16");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		    	
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8792968665");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshata@16");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
	}

}
