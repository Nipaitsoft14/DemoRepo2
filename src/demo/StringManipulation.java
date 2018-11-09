package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "The rain have started here.";
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('s', 9));

		//firefox driver
		//geckodriver 

		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); 
		//driver.get("http://www.google.com");
		
		//ChromeDriver 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching Chrome
		driver.get("http://www.google.com");//entering url 
				
				
		
		String title = driver.getTitle();//enter url
		System.out.println(title); // get title
		
		//validation point : actual vs. expected --> if you include validation point then it's automation with testing, test case is incomplete 
		// if you do not have validation point 
		if(title.equals("Google")) {
			System.out.println("Correct Title passed");
			
		}
		else {
			System.out.println("Incorrect title failed");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
		
	
	}

}
