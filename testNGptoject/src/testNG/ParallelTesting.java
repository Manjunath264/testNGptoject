package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void openGoogle(){
		System.setProperty("Webdriver.chrome.driver", "E:\\manjunath\\chrome path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
		
	}
	@Test
	public void OpenBing(){
		System.setProperty("Webdriver.chrome.driver", "E:\\manjunath\\chrome path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
		
	}
}
