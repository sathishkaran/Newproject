package Daradriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test01 {

	
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="login")
	private WebElement loginbutton;
	
	public  Test01(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void loginbutton() {
	
		public Test01(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public void loginbutton() {
			loginbtn.click();
		}
		
		public void emailaddress(String username) {
			emailaddresstb.sendKeys(username);
		}
	
	    public void password(String pwd) {
	       passwordtb.sendKeys(pwd);
	    
	    }
	    
	    public void sumbitbtn() {
	    	loginbutton.click();
	    
	    }
	
}
