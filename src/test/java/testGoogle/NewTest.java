package testGoogle;

import org.testng.annotations.Test;

import homepage.Homepage;
import hotelsListPage.HotelsListPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void searchHotelWithoutDate() {
		Homepage hp = new Homepage(driver);
		hp.inputDestination("Munich").submitSearchForm();
		new HotelsListPage(driver).verifyPageIsLoaded();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.accorhotels.com");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
