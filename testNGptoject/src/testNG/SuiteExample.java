package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuiteExample {

	@Test
	public void opengoogle(){
		System.setProperty("Webdriver.chrome.driver", "E:/manjunath/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	/*public void openBing(){
		System.setProperty("Webdriver.chrome.driver", "E:\\manjunath\\chrome path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
	}
	public void openYahoo(){*/
		
	
}
