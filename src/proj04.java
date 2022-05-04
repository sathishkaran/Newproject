
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class proj04 {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement ele = driver.findElement(By.name("field-keywords"));
Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
		
		}

	

			}