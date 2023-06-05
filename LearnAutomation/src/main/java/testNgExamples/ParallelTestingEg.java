package testNgExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingEg {

	@Test
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.google.co.in");
		driver.quit();
	}

	@Test
	public void OpenBing() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.bing.com");
		driver.quit();
	}
	@Test
	public void OpenYahoo() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.yahoo.com");
		driver.quit();
	}

}