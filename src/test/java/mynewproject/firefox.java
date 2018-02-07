package mynewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ACER/Desktop/geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();

driver.get("https://www.facebook.com/");
Thread.sleep(4000);
		
driver.close();
	}
}
