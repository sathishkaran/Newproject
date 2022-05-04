import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class proj01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ele.sendKeys("dres");

		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(ele1.size());

		for(WebElement b:ele1) {
			System.out.println(b.getText());
		}

		driver.close();


			}

	}
