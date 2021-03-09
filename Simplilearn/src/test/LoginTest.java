package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "//home/poojaystecnotre/Downloads/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "//home/poojaystecnotre/Downloads/geckodriver");
		
	     driver = new ChromeDriver();
	     //WebDriver driver = new FirefoxDriver();
	     
	     driver.get("https://www.simplilearn.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	     
	}
	
	@Test
	public void testcase1() {
		
	     	WebElement lnkLogin=driver.findElement(By.linkText("Log in"));
	     lnkLogin.click();
	     
	     WebElement editUsername=driver.findElement(By.name("user_login"));
	     editUsername.sendKeys("abc@xyz.com");
	     
	     WebElement editPwd=driver.findElement(By.name("user_pwd"));
	     editPwd.sendKeys("124");
	     
	     WebElement chkBox=driver.findElement(By.className("rememberMe"));
	     chkBox.click();
	     
	     WebElement btnPwd=driver.findElement(By.name("btn_login"));
	     btnPwd.click();
	     
	   
	     
	     
}
}

	     
	     

