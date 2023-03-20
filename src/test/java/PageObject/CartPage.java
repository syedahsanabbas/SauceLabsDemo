package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public CartPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Cart Page

	@FindBy(id = "checkout")
	@CacheLookup
	WebElement btn_checkout;

	// Identify Action on All Web Elements

	public void ClickCheckout() {
		btn_checkout.click();

	}
}
