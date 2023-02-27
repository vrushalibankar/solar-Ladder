package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver = new ChromeDriver();
		 driver.get("https://unergia-saas-staging-solarladder.vercel.app/login");
	}
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}

}
