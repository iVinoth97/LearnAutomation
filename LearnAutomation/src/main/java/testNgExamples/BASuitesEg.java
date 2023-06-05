package testNgExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BASuitesEg {
	//Aim: open Chrome Browser and go to 
	//1. google.co.in 2.bing.com and 3.yahoo.com and calculate the execution time then close the browser

	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser(){
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void openGoogle(){
		driver.get("http://www.google.co.in");	
	}
	@Test
	public void openBing(){
		driver.get("http://www.bing.com");	
	}
	@Test
	public void openYahoo(){
		driver.get("http://www.yahoo.com");
	}

	@AfterSuite
	public void closeBrowser(){
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime= endTime-startTime;
		System.out.println("Total time taken"+totalTime);
	}
}
