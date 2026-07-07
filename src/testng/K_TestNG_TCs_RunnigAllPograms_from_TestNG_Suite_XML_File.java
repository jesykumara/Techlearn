package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class K_TestNG_TCs_RunnigAllPograms_from_TestNG_Suite_XML_File {
 
	WebDriver driver;
	

	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test
	public void chatgpt() {
		driver.get("https://www.chatgpt.com");
	}
	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	public void bugzilla() {
		driver.get("https://www.bugzilla.org");
	}

  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
