package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ongole {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");	  
  }
  @BeforeTest
  public void beforeTest() {  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();  
  }

}
