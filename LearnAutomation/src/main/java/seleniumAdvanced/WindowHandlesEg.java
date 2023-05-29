package seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a")).click();
		driver.findElement(By.id("j_idt88:new")).click();

		String parentWindow = driver.getWindowHandle();

		WebElement buttonone = driver.findElement(By.id("home"));
		buttonone.click();

		Set<String> handles= driver.getWindowHandles();
		for (String ChildWindow : handles) {
			driver.switchTo().window(ChildWindow);
		}
		WebElement editButton = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editButton.click();

		driver.close();

		driver.switchTo().window(parentWindow); 
	}

}
