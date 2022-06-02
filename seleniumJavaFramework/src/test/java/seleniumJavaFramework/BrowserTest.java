package seleniumJavaFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "src\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Firefox Developer Edition\\firefox.exe");
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "src\\msedgedriver.exe"); 
		System.setProperty("webdriver.ie.driver", "src\\iedriverserver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		
		List <WebElement> listInput = driver.findElements(By.name("q"));
		int count = listInput.size();
		System.out.println("Count of Elements: "+ count);

		
		
		
	
		
		//driver.close();
		
	}

}
