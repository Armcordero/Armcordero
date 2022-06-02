package testSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPagesObjects;

public class GoogleSearchPagesTest {

	private static WebDriver driver =null;
	
	public static void main(String[] args) {
		
		googleSearchInTest();
		
	}
	
	public static void googleSearchInTest () {
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		driver = new ChromeDriver ();
		
		googleSearchPagesObjects searchPageObj = new googleSearchPagesObjects (driver);
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("SELENIUM");
		
		searchPageObj.clickOnButtonSearch();
		
		driver.close();
	}
}
