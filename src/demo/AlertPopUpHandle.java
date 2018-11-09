package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver 
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); // launching Chrome
		
				//driver.get("https://www.facebook.com/");
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
				driver.findElement(By.name("proceed")).click(); // click on go button 
				
				Thread.sleep(5000);
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				
				String text = alert.getText();
				if(text.equals("Please enter a valid user name")) {
					System.out.println("Correct alert message");
				}
				else {
					System.out.println("Incorrect alert message");
				}
				alert.accept();// this will click ok button 
				//alert.dismiss();// this will click cancle button, rightnow we don't have dismiss so 
								// we don't need this dissmiss method 
				
				
				
		
	}

}
