package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public CheckoutStepOnePage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Check out Step One Page

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement txtbox_firstname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement txtbox_lastname;
	
	@FindBy(id = "postal-code")
	@CacheLookup
	WebElement txtbox_postalcode;
	
	@FindBy(id = "continue")
	@CacheLookup
	WebElement btn_continue;
	
	// Identify Action on All Web Elements

	
		public void Setfirstname(String firstname) {
			txtbox_firstname.clear();
			txtbox_firstname.sendKeys(firstname);
		}
		
		public void Setlastname(String lastname) {
			txtbox_lastname.clear();
			txtbox_lastname.sendKeys(lastname);
		}
		
		public void Setpostalcode(String postalcode) {
			txtbox_postalcode.clear();
			txtbox_postalcode.sendKeys(postalcode);
		}
		
		public void ClickContinue() {
			btn_continue.click();

		}
	
}
