package testSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import propertiesFile.PropertiesFile1;

public class testNg_Demo {
	
	public static WebDriver driver =null;
	public static String browserName = null;

	@BeforeTest
	
	public void setUpTest() {
		PropertiesFile1.getProperties();
	}
	
	@Test
	public static void googleSearch () {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
	    driver.findElement(By.name("q")).submit();
		}
		
		else if (browserName.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "src\\msedgedriver.exe");
			driver = new EdgeDriver ();
			
			driver.manage().window().maximize();
			driver.get("https://google.com");
			
			driver.findElement(By.name("q")).sendKeys("Automation");
		    driver.findElement(By.name("q")).submit();
			}
	
	}
	
	@AfterTest
	public void tearDownTest() {
	     
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}
}
