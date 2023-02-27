package TestCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.*;


public class ProjectTest extends BaseTest{
	String ProjectId;
	HomePage hp ;
	@Test(priority='1')
	public void test_login()
	{
		LoginPage lp  = new LoginPage(driver);
		lp.getEmail("solarladdertest787@yopmail.com");
		lp.getPassword("password");
		lp.clickSubmit();
	}
	@Test(priority='2')
	public void test_home() throws InterruptedException
	{
		hp  = new HomePage(driver);
		hp.clickOnAddProjectbtn();
	}
	@Test(priority='3')
	public void test_create_project()
	{
		CreateProjectPage cpp = new CreateProjectPage(driver);
		cpp.getProjectSize("7");
		cpp.getCustomerName("suyash");
		cpp.getTelephone("9999999999");
		cpp.getLocation("Pune");
		ProjectId=cpp.getProjId();
		System.out.println("ProjectId"+ProjectId);
		cpp.clickOnCreateProjectbtn();
	}
	
	@Test(priority='4')
	public void test_enquiry_to_site() throws InterruptedException
	{
		List<WebElement> cardTitles= hp.getProjectcardsTitle();
		for(WebElement cardTitle : cardTitles)
		{
			System.out.println("cardTitle"+cardTitle.getText());
			
			if (cardTitle.getText().equals(ProjectId))
			{
				System.out.println("match found!!!");
				hp.performDragAndDropcard();
				break;
			}
			else
				System.out.println("card not matched!");
				
		}
	}
}
