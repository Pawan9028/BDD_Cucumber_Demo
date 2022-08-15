package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {

	WebDriver driver;
	//cucumber Annotations-->Hooks in cucumber
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
	

	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//	 driver = new ChromeDriver();
	 driver.get("file:///D:/Software/Selenium/Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    
	}
	@When("^user enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_credentials_and(String arg1, String arg2) throws Throwable {
		 driver.findElement(By.id("email")).sendKeys(arg1); 
		   driver.findElement(By.id("password")).sendKeys(arg2);
		   driver.findElement(By.xpath("//button")).click();
	}
	

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
	 Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	  
	   
	}
	@Then("^user should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {
	  WebElement logo = driver.findElement(By.tagName("img")) ;
	   Assert.assertTrue(logo.isDisplayed());
	}
}
