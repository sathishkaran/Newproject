import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.zeromq.ZStar.Set;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException, IOException  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("/www.selenium.dev/downloads/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.com/");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set child = (Set) driver.getWindowHandles();
		System.out.println(child);
		
		driver.quit();
		
	}
}