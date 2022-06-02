package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilProvider {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest () {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		driver = new ChromeDriver();		
		
	}
	@Test(dataProvider = "test1Data")
	public void test1 (String username, String password) throws Exception {
		System.out.println(username + "       |         " + password );
		
		driver.get("https://tutorialspoint.com");
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/a")).click();
		driver.findElement(By.id("user_email")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		WebElement login = driver.findElement(By.id("user_login"));
		login.click();
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name = "test1Data")
	public  Object [][] getData() {
		
		String excelPath= "C:/Users/AubreyCordero/Desktop/ECLIPSE-Work/seleniumJavaFramework/Excel/Data.xlsx";
		Object data [] [] = testData(excelPath,"Sheet1");
		return data;
	
	}
	
	public static Object[] [] testData(String excelPath, String sheetName) {
		
		ExcelUtil excel = new ExcelUtil(excelPath,sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();		 
		
		Object data [][] = new Object [rowCount-1][colCount] ;
		
			for(int i = 1; i <rowCount; i++) {	
				for (int j = 0; j < colCount; j++ ) {
					
					String cellCount = excel.getCellCountString(i, j) ;
					System.out.print(cellCount + "   |   ");
					data [ i-1][j] = cellCount;
				}
				System.out.println();
			}
			return data;
	}
	
	/** @AfterTest
	public static void tearDownTest () {
		
		driver.close();
		driver.quit();
		
	}*/
	}
