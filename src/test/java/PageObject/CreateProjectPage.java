package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProjectPage extends BasePage {

	public CreateProjectPage(WebDriver driver) {
		super(driver);
	}

	// Elements

	@FindBy(css = "input[name='projectSize']")
	WebElement txt_projSize;
	
	@FindBy(css = "input[name='customerName']")
	WebElement txt_custName;
	
	@FindBy(css = "input[type='tel']")
	WebElement txt_tel;
	
	@FindBy(css = "input[name='location']")
	WebElement txt_location;
	
	@FindBy(css = "button[type='submit']")
	WebElement btn_createProject;
	
	@FindBy(xpath ="//strong[contains(text(),'TE-')]")
	WebElement txt_projId;
	

	// Action Elements
	public void getProjectSize(String projSize) {
		txt_projSize.sendKeys(projSize);
	}
	public void getCustomerName(String custName) {
		txt_custName.sendKeys(custName);
	}
	public void getTelephone(String tel) {
		txt_tel.sendKeys(tel);
	}
	public void getLocation(String location) {
		txt_location.sendKeys(location);
	}
	public void clickOnCreateProjectbtn() {
		btn_createProject.click();
	}
	public String getProjId() {
		String projId =txt_projId.getText();
		return projId;
	}
}
