package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test () {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("- - headless");
		//options.addArguments("window-size=1280,800");
		driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		 
		driver.quit();
		driver.close();
		
		System.out.println("Completed");
	}
}
