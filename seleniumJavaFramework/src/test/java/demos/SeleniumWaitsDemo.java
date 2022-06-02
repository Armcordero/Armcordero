package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits () { 
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://tutorialspoint.com");
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/a")).click();
		driver.findElement(By.name("user_email")).sendKeys("aubrey.brey14@gmail.com");
		driver.findElement(By.name("user_password")).sendKeys("12345678");
		driver.findElement(By.id("user_login")).click();
		
		
		//WebDriverWait wait = new WebDriverWait(driver, null);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		driver.findElement(By.name("f")).sendKeys("abcd"); 
		
		//driver.close();
	}
	
}
