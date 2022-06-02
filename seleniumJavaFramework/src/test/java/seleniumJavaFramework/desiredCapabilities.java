package seleniumJavaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilities {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoredProtectedModeSettings",true);
		
		System.setProperty("webdriver.ie.driver","src\\IEDriverServer.exe");
		driver = new InternetExplorerDriver (caps);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		driver.findElement(By.name("q")).submit();
		
		driver.close();
		
	}
}
