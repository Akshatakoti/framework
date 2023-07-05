package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	@FindBy(id="firstName")
	private WebElement fnfield;
	@FindBy(id="lastName")
	private WebElement Lnfield;
	@FindBy(id="userEmail")                 
	private WebElement mailfield;
	@FindBy(name="gender")
	private WebElement genderbtn;
	@FindBy(id="userNumber")
	private WebElement mobilefield;
	@FindBy(id="dateOfBirthInput")
	private WebElement dobfield;
	@FindBy(className="subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3")
	private WebElement subjectfield;
	@FindBy(id="hobbies-checkbox-3")
	private WebElement radiobtn;
	@FindBy(id="uploadPicture")
	private WebElement upfield;
	@FindBy(id="currentAddress")
	private WebElement areafield;
	
	public pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void passfn(String fn)
	{
		fnfield.sendKeys(fn);
	}
	public void passln(String ln)
	{
		Lnfield.sendKeys(ln);
	}
	public void passmail(String mail)
	{
		mailfield.sendKeys(mail);
	}
	public void gender()
	{
		genderbtn.click();
	}
	public void passmobile(String number)
	{
		mobilefield.sendKeys(number);
	}
	public void passdob(String dob)
	{
		dobfield.sendKeys(dob);
	}
	public void passsubject(String subject)
	{
		subjectfield.sendKeys(subject);
	}
	public void passradio()
	{
		radiobtn.click();
	}
	public void passupfield(String phote)
	{
		upfield.sendKeys(phote);
	}
	public void passarea(String area)
	{
		areafield.sendKeys(area);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
