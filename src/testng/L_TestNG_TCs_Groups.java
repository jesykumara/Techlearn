package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class L_TestNG_TCs_Groups {
  
	WebDriver driver;
	

	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
		
	}
	
	@Test(groups="food")
	public void swiggy()
	{
		driver.get("https://www.swiggy.com");
	}
	

	@Test(groups="Ai")
	public void chatgpt() {
		driver.get("https://www.chatgpt.com");
		
	}
	

	@Test(groups="techtool")
	public void selenium() {
		driver.get("https://www.selenium.dev");
		
	}
	

	@Test(groups="search")
	public void google() {
		driver.get("https://www.google.com");
		
	}
	

	@Test(groups="techtool")
	public void redmine() {
		driver.get("https://www.redmine.org");
		
	}
	

	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
		
	}

	

	@Test(groups="social")
	public void x() {
		driver.get("https://www.x.com");
		
	}
			
	
  @BeforeTest(groups="food")
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
