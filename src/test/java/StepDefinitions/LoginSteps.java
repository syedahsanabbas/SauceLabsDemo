package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.InventoryPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage lp;
	InventoryPage ip;

	@Given("User is navigate to Login Page")
	public void user_is_navigate_to_login_page() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/SYED AHSAN ABBAS/eclipse-workspace/SauceLabDemo/src/test/resources/Drivers/chromedriver.exe");
		System.out.println("User is navigate to Login Page");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
	
		lp = new LoginPage(driver);
		
		lp.Setusername(username);
		System.out.println("User enters valid username");
		Thread.sleep(2000);
		lp.Setpassword(password);
		System.out.println("User enters valid password");
		Thread.sleep(2000);
		
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.ClickLogin();
		Thread.sleep(3000);
	}

	@Then("User is login successfully")
	public void user_is_login_successfully() {
		ip = new InventoryPage(driver);
		Boolean Logout = ip.IsDisplayLogout();
		if (Logout == true)
		{
		System.out.println("User is login successfully" + Logout);
		driver.quit();
		}
		else
		System.out.println("User is not login successfully" + Logout);
		driver.quit();
	}

}
