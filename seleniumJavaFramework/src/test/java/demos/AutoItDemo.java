package demos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AutoItDemo extends SetPropertiess{

	public static void main(String[] args) throws Exception {
	
		SetPropertiess.setUpProperties();
		AutoIT();
		SetPropertiess.tearDown();
		
	}
	
	@SuppressWarnings("deprecation")
	public static void AutoIT() throws Exception {
		
		driver.get("https://ufile.io/");
		driver.findElement(By.xpath("//*[@id=\"upload-window\"]/div")).click();
		
		Runtime.getRuntime().exec("C:/Users/AubreyCordero/Desktop/AutoIT/SampleAutoIT.exe");
 }
}