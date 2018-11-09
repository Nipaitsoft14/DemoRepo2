/*What this program do?
 * Practice Exercise – 1
Launch a new Firefox browser.
Open Store.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if the it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.
 */


package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_Exercise_one {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.google.com";//storing url in a string variable
		
		//both next two lines can launch the website
		driver.get(url);// we will use this now; 
		//driver.get("http://www.store.demoqa.com"); 
		
		//storing title name in a string varialbe 
		String title = driver.getTitle();
		
		//storing title length in a string variable 
		int titleLength = driver.getTitle().length();
		
		// Printing Title & Title length in the Console window
				System.out.println("Title of the page is : " + title);
				System.out.println("Length of the title is : "+ titleLength);
				
				// Storing URL in String variable
				String actualUrl = driver.getCurrentUrl();
				
				if (actualUrl.equals(url)){
					System.out.println("Verification Successful - The correct Url is opened.");
				}else{
					System.out.println("Verification Failed - An incorrect Url is opened.");
					//In case of Fail, you like to print the actual and expected URL for the record purpose
					System.out.println("Actual URL is : " + actualUrl);
					System.out.println("Expected URL is : " + url);
					// Storing Page Source in String variable
					String pageSource = driver.getPageSource();
			 
					// Storing Page Source length in Int variable
					int pageSourceLength = pageSource.length();
			 
					// Printing length of the Page Source on console
					System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
			 
					//Closing browser
					driver.close();
	}

}
}
