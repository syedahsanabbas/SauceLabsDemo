package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public CheckoutStepTwoPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Check out Step Two Page
	
	@FindBy(id = "finish")
	@CacheLookup
	WebElement btn_finish;
	
	// Identify Action on All Web Elements

		
		public void ClickFinish() {
			btn_finish.click();

		}
	
}
