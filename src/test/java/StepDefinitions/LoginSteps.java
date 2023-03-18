package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	WebDriver driver = null;
	LoginPage lp;

	@Given("User is navigate to Login Page")
	public void user_is_navigate_to_login_page() {
		System.out.println("User is navigate to Login Page");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/SYED AHSAN ABBAS/eclipse-workspace/SauceLabDemo/src/test/resources/Drivers/chromedriver.exe");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@When("User enters valid user name and password")
	public void user_enters_valid_user_name_and_password(String username, String password) throws InterruptedException {

	LoginPage lp = new LoginPage(driver);
	
		lp.Setusername("standard_user");
		System.out.println("User enters valid user name");
		
		lp.Setpassword("secret_sauce");
		System.out.println("User enters valid password");
		
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		lp.ClickLogin();
	}

	@Then("User is login successfully")
	public void user_is_login_successfully() {

		System.out.println("User is login successfully");
		driver.quit();
	}

}
