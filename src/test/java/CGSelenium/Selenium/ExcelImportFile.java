package CGSelenium.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelImportFile {
	
	public static void main(String[] args) throws FileNotFoundException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		FileInputStream fis= new FileInputStream("C:\\Users\\chint\\Downloads\\TestData.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(fis);
		
		
	}
	

}
