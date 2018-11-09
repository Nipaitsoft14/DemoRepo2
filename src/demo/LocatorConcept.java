package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.indeed.com/");
		
		/* [2]xpath:remember higharchy based xpath should not be used. 
		 * For example: ABSOLUTE value --> /html/body/div[1]/div[2]/div[2]/div/form/div[1]/div/div/div/div[1]/label[2]
		*the above line has higharchy based xpath and should not be used
		*this RELATIVE xpath can be used: //*[@id="text-input-what"]
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]" )).sendKeys("Nilupa");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]" )).sendKeys("Nipa");
		driver.findElement(By.xpath("//*[@id=\"email\"]" )).sendKeys("nipa.itsoft@gmail.com");
		*/
		
		/* [1]id: 
		driver.findElement(By.id("firstname")).sendKeys("Nilupa");
		driver.findElement(By.id("lastname")).sendKeys("Nipa");
		driver.findElement(By.id("email")).sendKeys("nipa.itsoft@gmail.com");
		*/
		
		/* [3]name: 
		 driver.findElement(By.name("firstname")).sendKeys("Nilupa");
		 driver.findElement(By.name("lastname")).sendKeys("Nipa");
		 driver.findElement(By.name("email")).sendKeys("nipa.itsoft@gmail.com");
		  */
		
		/* [1] but you can use ID if available
		 *  LinkText: used only for link 
		
		 driver.findElement(By.linkText("Sign in")).click();
		 NOTE: all the links are represented by a tag, if a tag is there you won't 
		 find id and name most of the time. 
	    */

		/*PartialLinkText -- This is not recommended to use
		driver.findElement(By.partialLinkText("Create a business")).click(); 
	    */
		
		 /*[2]CSS selector 
		  * NOTE: if ID value is there then you can put #{id}
		  *       if class value is there then you can put .{class}
		  
		  driver.findElement(By.cssSelector("#email")).sendKeys("nipa.itsoft@gmail.com");
		*/
		
		/*[4]class name - not recommended- can be same so not recommended. 
		 
		driver.findElement(By.className("icl-TextInput-wrapper")).sendKeys("nipa.itsoft@gmail.com");
		 */
		
	}

}
