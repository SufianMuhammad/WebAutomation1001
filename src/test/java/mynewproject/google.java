package mynewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		
		
		 
		  System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Desktop/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");	 
	Thread.sleep(3000);
	driver.quit();
	}
	

}
