package Daradriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

	
	public static void main(String[] args) throws IOException {
		 FileInputStream  fis=new FileInputStream("./data.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 String username=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		 String password=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		 
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.id("email")).sendKeys("username");
			driver.findElement(By.name("pass")).sendKeys("password");
	}
	
}
