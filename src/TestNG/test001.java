package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test001 {
	    
	   @Test
	   public void tc1() {
            Reporter.log("hello java",false);
            Reporter.log("Hello selenium",true);
	   }
}

  