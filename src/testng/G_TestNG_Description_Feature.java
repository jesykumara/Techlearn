package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class G_TestNG_Description_Feature  {
	WebDriver driver;
	
  @Test(description="Verify Google URL")
  public void tc1()
     {
	  driver.get("http://www.Google.com");
     }
	 
		
	  @Test(description="Verify Chatgpt URL")
	  public void tc2()
	  {
		  driver.get("http://www.Chatgpt.com");
	  }
		  
			
		  @Test(description="Verify X URL")
		  public void tc3()
		  {
			  driver.get("http://www.X.com");
		  }
				
			  @Test(description="Verify Selenium URL")
			  public void tc4()
			  {
				  driver.get("http://www.Selenium.dev");
			  }
				  
					
				  @Test(description="Verify Swiggy URL")
				  public void tc5() 
				  {
					  driver.get("http://www.Swiggy.com");
				  }
					  
						
					  @Test(description="Verify Redmine URL")
					  public void tc6()
					  {
						  driver.get("http://www.Redmine.com");
					  }
						  
							
						  @Test(description="Verify Zomoto URL")
						  public void tc7()
						  {
							  driver.get("http://wwww.Zomoto.com");
						  }
							  
								
							  @Test(description="Verify BugZilla URL")
							  public void tc8()
							  {
								  driver.get("http://www.BugZilla.org");
							  }
	  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();  }

}
