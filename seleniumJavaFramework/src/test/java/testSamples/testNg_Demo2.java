package testSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg_Demo2 {
	
	private static WebDriver driver =null;

	@BeforeTest
	
	public void setUpTest() {
		
	}
	
	@Test
	public void googleSearch2() {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
	    driver.findElement(By.name("q")).submit();
		
	
	}
	
	@Test
	public void googleSearch3() {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
	    driver.findElement(By.name("q")).submit();
		
	
	}
	
	@AfterTest
	public void tearDownTest() {
	     
		//driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}
}
