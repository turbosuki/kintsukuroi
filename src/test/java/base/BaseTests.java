package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class BaseTests
{
	private WebDriver driver;
	private String baseUrl = "https://the-internet.herokuapp.com/";
	protected HomePage homePage;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);

		homePage = new HomePage(driver);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}