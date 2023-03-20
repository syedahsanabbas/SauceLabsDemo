package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public LoginPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Login Page
	
	@FindBy(id = "user-name")
	@CacheLookup
	WebElement txtbox_username;

	@FindBy(id = "password")
	@CacheLookup
	WebElement txtbox_password;
	
	@FindBy(id = "login-button")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(id = "error-message-container")
	@CacheLookup
	public WebElement Message_Text;
	
	
	// Identify Action on All Web Elements
	
	public void Setusername(String username) {
		txtbox_username.clear();
		txtbox_username.sendKeys(username);
	}
	
	public void Setpassword(String password) {
		txtbox_password.clear();
		txtbox_password.sendKeys(password);
	}
	
	public void ClickLogin() {
		btn_login.click();

	}

	
}
