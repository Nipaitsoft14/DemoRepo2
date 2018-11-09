package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		//ChromeDriver 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching Chrome

		//driver.get("https://www.facebook.com/");
		driver.get("https://html.com/input-type-file/"); 
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C://Users/nipani/Desktop/Ops Team.JPG");
		
		
		
		
		
		
		
		
		
		
		

	}

}
