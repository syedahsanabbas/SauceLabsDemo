package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	// Create object of Webdriver
		WebDriver ldriver;

		// Creating Constructor
		public InventoryPage(WebDriver rdriver)

		{
			ldriver = rdriver;

			PageFactory.initElements(rdriver, this);

		}

		// Identify All Web Elements on Login Page
		
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		@CacheLookup
		WebElement lnktext_logout;
		
		public Boolean IsDisplayLogout() {
			Boolean Display =	lnktext_logout.isDisplayed();
			return Display;

		}
	
}
