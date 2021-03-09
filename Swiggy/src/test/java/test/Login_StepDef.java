package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {
	 WebDriver driver;
		
		@Given("^User has opened Swiggy website on Chrome Browser$")
	    public void user_has_opened_swiggy_website_on_chrome_browser() throws Throwable {
			System.setProperty("webdriver.chrome.driver","chromedriver");
	        
	        System.setProperty("webdriver.gecko.driver","geckodriver");    
	        driver = new ChromeDriver();
	        driver.get("https://www.swiggy.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	        
	    }
		
		 @When("^User enters correct \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
		    public void user_enters_correct_something_and_something_and_something_and_something(String phoneno, String username, String email, String password) throws Throwable {
		     
			 WebElement lnkLogin = driver.findElement(By.linkText("Login"));
		        lnkLogin.click();
		        
		        WebElement phoneNo = driver.findElement(By.id("mobile"));
		        phoneNo.sendKeys(phoneno);
		        
		        WebElement submit = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		        submit.click();
		        
		        WebElement userName = driver.findElement(By.id("name"));
		        userName.sendKeys(username);
		        
		        WebElement Email = driver.findElement(By.id("email"));
		        Email.sendKeys(email);
		        
		        WebElement Password = driver.findElement(By.id("password"));
		        Password.sendKeys(password);
		        
		        WebElement continueClick= driver.findElement(By.xpath("//a[@class='a-ayg']"));
		        continueClick.click();   
		 }


	    

	    @Then("^User should be able to login successfully$")
	    public void user_should_be_able_to_login_successfully() throws Throwable {

	    }
		

}
