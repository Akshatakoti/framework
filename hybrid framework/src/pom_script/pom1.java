package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.Basepage;

public class pom1 extends Basepage 
{
	@FindBy(id="email")
    private WebElement unfield;
	@FindBy(id="pass")
    private WebElement pwdfield;
	@FindBy(name="Login")
    private WebElement loginBtn;
	
	public pom1 (WebDriver driver)
	{
		super(driver);
		
	}
	public void passUN(String un)
	{
		unfield.sendKeys(un);
	}
	public void passpwd(String pwd)
	{
		unfield.sendKeys(pwd);
	}
	public void btn(String btn)
	{
		loginBtn.sendKeys(btn);
	}
}
