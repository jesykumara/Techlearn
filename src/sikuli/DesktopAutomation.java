package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	
	Screen s = new Screen();
	
	
  @Test
  public void f() throws FindFailed, InterruptedException {
	  
	  Thread.sleep(3000);
	  
	  s.click("D:\\LIB\\Sikuli\\W.PNG");
	  
	 
	  
  }
}
