package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  C_TestNG_TCs_Execution_By_Alphabatical_Oreder {
  
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
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
	  @BeforeTest
	  public void beforeTest1() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest1() {
		  driver.quit();
	  }

	}
	

