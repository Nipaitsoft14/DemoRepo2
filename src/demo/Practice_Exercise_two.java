/*Practice Exercise
Launch new Browser
Open DemoQA.com website
Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
Come back to Home page (Use ‘Back’ command)
Again go back to Registration page (This time use ‘Forward’ command)
Again come back to Home page (This time use ‘To’ command)
Refresh the Browser (Use ‘Refresh’ command)
Close the Browser

*/


package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_Exercise_two {

	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");	
    
	WebDriver driver = new FirefoxDriver(); 
 // Open ToolsQA web site
 		String appUrl = "https://www.google.com/webhp?client=firefox-b-1-ab";
 		driver.get(appUrl);
    driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div/div/div/div/span[1]/a[1]")).click();
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().to(appUrl);
    driver.navigate().refresh();
    driver.close();
	}

}
