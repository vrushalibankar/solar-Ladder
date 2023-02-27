package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	Actions action;

	public HomePage(WebDriver driver) {
		super(driver);

	}
	// Elements

	@FindBy(css = "button[class*='crm-addprojectbutton']")
	WebElement btn_addProject;

	// By div_project =
	// By.xpath("//section[@title='Enquiry']//div[@class='crm-projectcard']");
	@FindBy(xpath = "//section[@title='Enquiry']//div[@class='crm-projectcard']//div[@class='crm-projectcard-top-title-maintitle']")
	List<WebElement> div_projectcardstitles;

	@FindBy(xpath = "(//div[@class='crm-projectcard'])[1]")
	WebElement div_enquiry_projectcard;

	// @FindBy(xpath = "//section[@title='Site
	// Visit']//div[contains(@class,'vertical')]")
	@FindBy(xpath = "//div[@lane='romFQMsvOO3xFnUzL1q1-lane60']")
	WebElement div_sitevisit;

	public void clickOnAddProjectbtn() throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_addProject);
		// btn_addProject.click();
	}

	public List<WebElement> getProjectcardsTitle() throws InterruptedException {
		// waitForElement(div_project);
		Thread.sleep(3000);
		return div_projectcardstitles;
	}

	public void performDragAndDropcard() throws InterruptedException {
		Thread.sleep(1000);
		action = actionClassObjCreation();

		Action dragAndDrop = action.clickAndHold(div_enquiry_projectcard).moveToElement(div_sitevisit)
				.release(div_sitevisit).build();

		// Performing the drag and drop action
		dragAndDrop.perform();
		// action.dragAndDrop(div_enquiry_projectcard, div_sitevisit).build().perform();
	}
}
