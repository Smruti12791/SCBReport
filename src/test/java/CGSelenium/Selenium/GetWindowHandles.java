package CGSelenium.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("iPhone",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 14 Plus')][@class='KzDlHZ'])[1]")).click();
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	String firstWindow=it.next();
	String secondWindow=it.next();
	while(it.hasNext())
	{
		driver.switchTo().window(secondWindow);
		String title1=driver.getTitle();
		System.out.println(title1);
		}
	}
	
	}



