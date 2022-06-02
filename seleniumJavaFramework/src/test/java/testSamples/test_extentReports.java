package testSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test_extentReports {
	
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter ("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		 ExtentTest test = extent.createTest("Google Search");
		
		System.setProperty("webdriver.gecko.driver", "src\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Firefox Developer Edition\\firefox.exe");
		
		driver = new FirefoxDriver();
		 
		test.log(Status.INFO, "Starting the Test Case");
		driver.manage().window().maximize();
		driver.get("https://google.com");
		test.pass("Navigated the Google");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		test.pass("Entering a text");
		
	    driver.findElement(By.name("q")).click();
	    test.pass("Searching the Text");
		
	    //driver.close();
	    driver.quit();
	    test.pass("Close the Browser");
	     
	    test.pass("Test Completed!");
	    	    
	    
	    extent.flush();
		
		
		}
}
	
