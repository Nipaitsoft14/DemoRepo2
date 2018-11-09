  package demo;
       
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities; 

public class TestFacebookRegistration{

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			
	//DesiredCapabilities capabilities = DesiredCapabilities.firefox();	
	
						//capabilities.setCapability("marionette", true);
			
		//	try {
				WebDriver driver = new FirefoxDriver();
				
				//driver.get("https://www.facebook.com/");
				driver.get("https://www.facebook.com/"); 
				driver.manage().window().maximize();
				//Thread.sleep(1000);
				
			//}catch (Exception e) {
			//	System.out.println(e);
		//	}
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("safa.rashid08@gmail.com");
				//driver.findElement(By.xpath(".//*[@id=\"pass\"]")).sendKeys("1234");
			
				driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("Nilupa");
				driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("Nipa");
				driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("6127578343");
				driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("BlackHorse");
				
				
				//driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
				
				Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
					   sel1.selectByIndex(5);
					   
			    Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
			    	   sel2.selectByValue("6");
			    	   
			    Select sel3 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
			    	   sel3.selectByIndex(19);	
			    	   
			   driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click(); 	   
			   driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click(); 	
			
			
			   driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]")).click(); //*[@id="reg_pages_msg"]
			   //driver.navigate().to("https://www.facebook.com/");
			   //Thread.sleep(1000);
				
			  // driver.navigate().back();
			   //driver.quit();
			   //driver.manage().deleteAllCookies(); //command is used for deleting all cookies 
			 //  driver.findElement(By.id(“id_of_element”)).isDisplayed();
	}
	

}
