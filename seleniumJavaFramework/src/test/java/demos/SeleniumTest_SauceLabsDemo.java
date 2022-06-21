package demos;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest_SauceLabsDemo {
	
	static WebDriver driver;
	//static WebElement text;
	
	public static final String USERNAME = "oauth-arosemcordero-4a43f";
	public static final String ACCESS_KEY = "faf6a0c3-a064-4d5e-81ad-36e86a8c4500";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	
	@BeforeTest
		public void setSauceLabs () {	
		
		}
		
	@Test
		public static void sauceLabsTest () throws MalformedURLException{
			
	  //  System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		
	    ChromeOptions browserOptions = new ChromeOptions();
	    browserOptions.setPlatformName("Windows 10");
	    browserOptions.setBrowserVersion("101");
	    Map<String, Object> sauceOptions = new HashMap<>();
	    browserOptions.setCapability("sauce:options", sauceOptions);

		driver = new RemoteWebDriver(new java.net.URL(URL), browserOptions);
		
		driver.get("https://youtube.com");
		System.out.println(driver.getTitle());
		
//		text = driver.findElement(By.name("q"));
//		text.sendKeys("Selenium on Sauce Labs");
//		text.submit();
//		System.out.println(driver.getTitle());
	}

	@AfterTest
		public void tearSauceLabs () {
		
		driver.quit();
		System.out.println("Test Completed");
		
		
	}
	
}


