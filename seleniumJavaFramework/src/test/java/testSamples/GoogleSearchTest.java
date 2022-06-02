package testSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPages;


public class GoogleSearchTest {
	
	private static WebDriver driver =null;

	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch () {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
	    driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		googleSearchPages.textbox_search(driver).sendKeys("Selenium");
		
	//	driver.findElement(By.name("q")).submit();
		googleSearchPages.button_search(driver).submit();		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}
}
