package testng;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class E_TestNG_TCs_Skip_Ignore_Disabled {
  
	
	
	WebDriver driver;
	@Test(priority=2, enabled=false)
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test(priority=3)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Ignore
	  @Test(priority=5)
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  @Test(enabled=false, priority=1)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(priority=4, enabled=true)
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @Test(priority=0)
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
