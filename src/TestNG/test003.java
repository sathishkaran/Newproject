package TestNG;

import org.junit.Test;
import org.testng.Reporter;

public class test003 {

	
	
	@Test(priority = -1,)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test(priority = -1,invocationCount = 5)
	public void calls() {
		Reporter.log("calls",true);
}

	@Test(enabled=false)
	public void settings() {
		Reporter.log("settings",true);
	
}

}
