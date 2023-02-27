package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
//Elements
	
	@FindBy(css="input[name='email']")
	WebElement txt_email;
	
	@FindBy(css="input[name='password']")
	WebElement txt_pwd;
	
	@FindBy(css="button[type='submit']")
	WebElement btn_submit;
	
//Action Elements
	
	public void getEmail(String user_email)
	{
		txt_email.sendKeys(user_email);
	}
	public void getPassword(String user_pwd)
	{
		txt_pwd.sendKeys(user_pwd);
	}
	public void clickSubmit()
	{
		btn_submit.click();
	}
	
}
