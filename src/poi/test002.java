package poi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test002 {

	public test002(WebDriver driver) {
		

	public static void main(String[] args)  {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		test002 s=new test002(driver);
	s.loginbutton();
	s.emailaddress("admin");
	s.password("manager");
	s.sumbitbtn();
	
	
	
	}


	private void sumbitbtn() {
		// TODO Auto-generated method stub
		
	}


	private void password(String string) {
		// TODO Auto-generated method stub
		
	}


	private void emailaddress(String string) {
		// TODO Auto-generated method stub
		
	}


	private void loginbutton() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
