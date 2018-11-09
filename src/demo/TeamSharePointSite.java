package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TeamSharePointSite{

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://login.microsoftonline.com/c1eb5112-7946-4c9d-bc57-40040cfe3a91/oauth2/authorize?client_id=00000003-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code%20id_token&resource=00000003-0000-0ff1-ce00-000000000000&scope=openid&nonce=4490D661E2B4F8E0B1785F93D6183619F11C250598969586-9FB26595122AF4E651A32C2B9A2DE8B9344401FA24392CEC42CE3699D0F2A44C&redirect_uri=https:%2F%2Fecolab.sharepoint.com%2F_forms%2Fdefault.aspx&wsucxt=1&cobrandid=11bd8083-87e0-41b5-bb78-0bc43c8a8e8a&client-request-id=5b459e9e-60d2-7000-5c0b-3740826d8d6b");
		
		
driver.findElement(By.id("i0116")).sendKeys("Nilupa.nipa@ecolab.com");
	driver.findElement(By.id("idSIButton9")).click();
		
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		
//		String text = alert.getText();
//		if(text.equals("Please enter a valid user name")) {
//			driver.findElement(By.id("i0116")).sendKeys("Nilupa.nipa@ecolab.com");
//			alert.accept(); 
//		}
//		else {
//			System.out.println("Incorrect alert message");
	}
}


