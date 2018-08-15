package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;

	By inputDestination = By.xpath("//*[@id='search-destination-boo']");
	By searchButton = By.xpath("//*[@id='engine-submit']");

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	// Set destination in search field
	public Homepage inputDestination(String destination) {
		driver.findElement(inputDestination).sendKeys(destination);
		return this;
	}

	// Submit serach form
	public Homepage submitSearchForm() {
		driver.findElement(searchButton).click();
		return this;
	}

}
