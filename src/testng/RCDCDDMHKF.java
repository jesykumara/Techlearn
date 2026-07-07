package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDCDDMHKF {
	WebDriver driver;
	
	
  @Test
  public void RightClickFeature() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(3000);
	  
	   Actions a = new Actions(driver);
	   a.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"))).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void doubleClickFeature() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	//  act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).build().perform();
	//  act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).doubleClick().build().perform();
  }
  
  @Test
  public void mouseHoverFeature() throws InterruptedException {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[@role='button']"))).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='Github']")).click();
	//  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Github']"))).click().build().perform();
	}
  
  @Test
  public void draganddropFeature() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  
	  WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
	  
	  WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
	  
	  act.dragAndDrop(source, target).build().perform();
	  
  }
  
  @Test
  public void KeyboardFeature() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
	//  act.sendKeys(Keys.TAB).build().perform();
	  
  }
}
