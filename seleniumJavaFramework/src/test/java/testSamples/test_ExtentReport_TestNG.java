package testSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test_ExtentReport_TestNG {
	
	ExtentReports extent = null;
	ExtentSparkReporter spark = null;
    ExtentTest test = null;
    
    WebDriver driver = null;
	
	@BeforeSuite
	public void setUp () {
		extent = new ExtentReports();
        spark = new ExtentSparkReporter("Spark.html");
        extent.attachReporter(spark);
        
        System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	
	@Test
	public void test1 () {
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		test =extent. createTest("My First test", "Test Sample");
		test.log(Status.INFO,"This steps show the status info of log (status,details)");
		test.info("This show the usage of info(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		test.addScreenCaptureFromPath("extent.png");

	
	}
	
	@AfterTest
	public void tearDownTest() {
	     
		driver.close();
		driver.quit();
		
		System.out.println("Test Completed Successfully");
		
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
		
	}
	
 }
