package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class P_ManyAlerts {
 
	 WebDriver driver;
	@Test
	  public void ManyalertsWindowsAperiance() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
		  Thread.sleep(3000);
		 
		  Alert a = driver.switchTo().alert();
		  a.sendKeys("Jesy");
		  a.accept();
		  
		  Thread.sleep(4000);
		  
	    }
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

}
