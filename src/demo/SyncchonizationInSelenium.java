package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncchonizationInSelenium {

	public static void main(String[] args) {

		//ChromeDriver 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching Chrome
		
		//all waits are dynamic waits 
		//Dynamic wait, if page is loaded in 2 seconds then it will ignor the 18 seconds
		//Static wait, Thread.sleep(5000)--> this is static wait and will wait until 5 seconds are over

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);//wait 20 seconds to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // 
		//implicitlyWait is always applied globally |  is available for all the webelements that the driver is interacting 
		
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("Nilupa");
		driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("Nipa");
		
	}
		
		public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value); 
			
			
			
			
			
			
		}





	}


