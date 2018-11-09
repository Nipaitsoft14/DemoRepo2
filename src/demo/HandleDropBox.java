package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		
		//handle dropdown we need the object of select class 
		Select select = new Select(driver.findElement(By.id("month"))); 
		//Select select = new Select(driver.findElement(By.id("month"]"))); 
		select.selectByVisibleText("Dec");
		
	}
}
