package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class J_TestNG_Invocation_Count {
 
	
	WebDriver driver;
	
	  @Test
	  public void techlearn() {	 
		  driver.get("https://www.techlearn.in/admin");
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Jesy");
		  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Test@321");
		  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		  driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
	  }
	  
	  @Test(invocationCount=5)
	  public void baalabharathi() {
		  driver.get("https://www.baalabharathi.com/admin");
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Kumar");
		  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Test@321");
		  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		  driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
	  }
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();

	  }

}
