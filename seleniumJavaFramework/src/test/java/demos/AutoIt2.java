package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoIt2 {

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception  {

		SetPropertiess.setUpProperties();
		test1();
		SetPropertiess.tearDown();

	}

	@SuppressWarnings("deprecation")
	public static void test1() throws Exception {

		driver = new ChromeDriver();	

		driver.get("https://codepen.io/rcass/pen/MmYwEp");
		driver.switchTo().frame("CodePen");

		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.name("fileToUpload"))).click().build().perform();

		//		WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5))
		//	    .until(ExpectedConditions.elementToBeClickable(By.id("fileToUpload")));
	
		Runtime.getRuntime().exec("C:\\Users\\AubreyCordero\\Desktop\\AutoIT\\SampleAutoIT.exe"); 

	}

}

