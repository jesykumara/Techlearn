package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class H_Depends_On_Methods {
	
	WebDriver driver;
	
  @Test
  public void method2() {
	  

		WebElement usrname = driver.findElement(By.id("user_login"));
		usrname.sendKeys("Ongole");
		
		WebElement password = driver.findElement(By.name("pwd")); 
		password.sendKeys("Test");
		
		WebElement checkbox = driver.findElement(By.id("rememberme"));
		checkbox.click();
  }
  
  public void method1()
  {
	driver.get("https://www.techlearn.in/admit");  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
