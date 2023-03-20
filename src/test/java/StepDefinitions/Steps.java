package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.CartPage;
import PageObject.CheckoutStepOnePage;
import PageObject.CheckoutStepTwoPage;
import PageObject.InventoryPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	LoginPage lp;
	InventoryPage ip;
	CartPage cp;
	CheckoutStepOnePage cosop;
	CheckoutStepTwoPage costp;

	@Given("User is navigate to Login Page")
	public void user_is_navigate_to_login_page() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
	
		lp = new LoginPage(driver);
		
		lp.Setusername(username);
		Thread.sleep(1000);
		lp.Setpassword(password);
		Thread.sleep(1000);
		
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.ClickLogin();
		Thread.sleep(3000);
	}

	@Then("User is login successfully")
	public void user_is_login_successfully() throws InterruptedException {
				
		String currenturl = driver.getCurrentUrl();
		System.out.print(currenturl);
		String expectedurl = "https://www.saucedemo.com/inventory.html";
		if (currenturl.equals(expectedurl))
		{
			System.out.println("User is login successfully!!!");
			
			
		}
		else
		{
			System.out.println("User is not login successfully!!!");
			
		}
			
	}
	
	@And("Clicks Add to Cart on Sauce Labs Backpack")
	public void clicks_add_to_Cart_on_sauce_labs_backpack() throws InterruptedException {
		ip = new InventoryPage(driver);
		ip.ClickSauceLabsBackpack();
		Thread.sleep(2000);
	   
	}


	@And("Open my Shopping Cart")
	public void open_my_shopping_cart() throws InterruptedException {
		ip = new InventoryPage(driver);
		ip.ClickShoppingCartbutton();
		Thread.sleep(2000);
	}

	@Then("User should see the Sauce Labs Backpack in Shopping Cart and clicks continue for checkout")
	public void user_should_see_the_sauce_labs_backpack_in_shopping_cart_and_clicks_continue_for_checkout() throws InterruptedException {
		
	cp = new CartPage(driver);
	cp.ClickCheckout();
	Thread.sleep(5000);
	}

	
	@And("^User should enter (.*), (.*) and (.*)$")
	public void user_should_enter_firstname_lastname_and_postalcode(String firstname, String lastname, String postalcode ) throws InterruptedException {
	cosop = new CheckoutStepOnePage(driver);
	cosop.Setfirstname(firstname);
	Thread.sleep(2000);
	cosop.Setlastname(lastname);
	Thread.sleep(2000);
	cosop.Setpostalcode(postalcode);
	Thread.sleep(2000);
	}
	
	 @And("Clicks Continue button")
	 public void clicks_continue_button() throws InterruptedException
	 {
			cosop = new CheckoutStepOnePage(driver);
			cosop.ClickContinue();
			Thread.sleep(2000);
		 
	 }
	 
	 @And("Clicks Finish button")
	 public void clicks_finish_button() throws InterruptedException
	 {
			costp = new CheckoutStepTwoPage(driver);
			costp.ClickFinish();
			Thread.sleep(2000);
		 
	 }
	}

