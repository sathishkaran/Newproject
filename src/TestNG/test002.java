package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test002 {

	
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test(priority = -1)
	public void calls() {
		Reporter.log("calls",true);
}

	@Test
	public void settings() {
		Reporter.log("settings",true);
	
}

}
