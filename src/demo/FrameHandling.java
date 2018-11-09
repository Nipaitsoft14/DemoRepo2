package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriverException;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException{
		
				//ChromeDriver 
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); // launching Chrome
//				
				//FirefoxDriver  
//				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//				WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();//maximize window	
		driver.manage().deleteAllCookies(); // delete all the cookies
			
				//dynamic wait
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				
				
				//driver.get("https://www.facebook.com/");
				driver.get("https://metrostate.learn.minnstate.edu/"); 
				//driver.findElement(By.xpath("//li[@class='aac-fea--fdf-cdcbed']//a")).click();
				 driver.findElement(By.linkText("Sign on with StarID")).click();
				 driver.findElement(By.id("username")).sendKeys("vz7414on");
				 driver.findElement(By.id("password")).sendKeys("Safasept20!8");
				 
				 driver.findElement(By.name("_eventId_proceed")).click();	
//				
//				driver.switchTo().frame("mainpanel");
//				Thread.sleep(2000);
//				
//			
//				//driver.findElement(By.name("frmLogin")).click();
////			
	Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(text(),'eServices')] ")).click();
Thread.sleep(10000);
driver.close();
//driver.switchTo().frame("mainpanel");
//Thread.sleep(2000);
//

//driver.findElement(By.partialLinkText("IT Services")).click();
//	
				
	}

}
