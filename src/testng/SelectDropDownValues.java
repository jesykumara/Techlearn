package testng;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;


	
	
	public class SelectDropDownValues {
		WebDriver driver;
	  @Test
	  public void dropdownoptions() throws InterruptedException { 
		  driver.get("https://www.redmine.org/");
		  driver.findElement(By.xpath("//a[@class='register']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("Jesy@gmail.com");
		  Thread.sleep(3000);
		  
		  Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		//  a.selectByContainsVisibleText("Bu");
		 
		  obj.selectByIndex(7);
		  //obj.selectByValue("es");
		//   obj.selectByVisibleText("Arabic (عربي)");
	  }
		  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
