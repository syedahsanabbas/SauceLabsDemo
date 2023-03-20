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
		
		@FindBy(id = "react-burger-menu-btn")
		@CacheLookup
		WebElement btn_burgermenu;
		
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		@CacheLookup
		WebElement lnktext_logout;
		
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		@CacheLookup
		WebElement btn_SauceLabsBackpack;
		
		@FindBy(xpath = "//span[@class='shopping_cart_badge']")
		@CacheLookup
		WebElement Btn_ShoppingCart;
		
		// Identify Action on All Web Elements
		
		public void ClickMenu() {
			btn_burgermenu.click();

		}
		
		public Boolean IsDisplayLogout() {
			Boolean Display =	lnktext_logout.isDisplayed();
			return Display;

		}
		
		public void ClickSauceLabsBackpack() {
			btn_SauceLabsBackpack.click();

		}
		
		public void ClickShoppingCartbutton() {
			Btn_ShoppingCart.click();

		}
	
}
