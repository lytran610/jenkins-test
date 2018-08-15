package hotelsListPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HotelsListPage {
	WebDriver driver;

	By hotelName = By.xpath("//*[contains(@class, 'hotel-title--link')]");

	// Verify page is loaded
	public HotelsListPage(WebDriver driver) {
		this.driver = driver;
	}

	public HotelsListPage verifyPageIsLoaded() {

		boolean display = driver.findElement(hotelName).isDisplayed();
		Assert.assertTrue(display == true, "Hotels list page is loaded correctly");

		return this;
	}
}
