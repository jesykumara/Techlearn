package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HandleAlertWindows {
	
	WebDriver driver;
	
  @Test
  public void alertOkButton() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/how-to-handle-alert-box-using-selenium/");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"post-689\"]/div/div/button")).click();
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
