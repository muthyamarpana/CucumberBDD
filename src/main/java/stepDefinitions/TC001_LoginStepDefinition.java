package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefinition {
	
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   System.out.println("Launch Rediff");
	   driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@When("user clicks on Signin link")
	public void user_clicks_on_signin_link() {
	   System.out.println("Click on Signin link");
	   driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("next page is displayed check title")
	public void next_page_is_displayed_check_title() {
	    System.out.println("Check title");
	    
		String title=driver.getTitle();
		Assert.assertEquals(title, "Rediffmail");
		System.out.println("Assert executed");
	}
	@When("user enters valid username valid password")
	public void user_enters_valid_username_valid_password() {
	   System.out.println("Enter user name and password");
	   driver.findElement(By.id("login1")).sendKeys("jack");
		driver.findElement(By.id("password")).sendKeys("jack123");
		driver.findElement(By.id("remember")).click();
	}
	@When("click on Submit button")
	public void click_on_submit_button() {
	    System.out.println("Click on Submit button");
	}
	@Then("check user account display a message as login successful")
	public void check_user_account_display_a_message_as_login_successful() {
	    System.out.println("Login Successful");
	}
	@Then("logout")
	public void logout() {
	    System.out.println("Logout and close");
	    driver.quit();
	}



}
