 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleSearchPagesObjects {

	WebDriver driver = null;
	
	By textBox_search = By.name("q");
	By button_search = By.name("q");
	
	public googleSearchPagesObjects ( WebDriver driver) {
		this.driver =driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textBox_search).sendKeys(text);	
		
	}
	
	public void clickOnButtonSearch() {
		driver.findElement(button_search).submit();
	}
}
