package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPropertiess {

	static WebDriver driver;
	
	public static void setUpProperties() {
		
		System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
	   driver = new ChromeDriver();	
		
		//System.setProperty("webdriver.edge.driver","src\\msedgedriver.exe");
		//driver = new EdgeDriver();	
		
		driver.manage().window().maximize();
		
	}
	
	public static void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
		//driver.close();
		
	}
}
