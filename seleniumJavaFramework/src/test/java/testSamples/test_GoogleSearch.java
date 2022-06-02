package testSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch () {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).submit();
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}
}
