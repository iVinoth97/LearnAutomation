package seleniumBasicUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 
		 
		 WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("Selenium" + "\n");
		 
		 
		 List<WebElement> Links = driver.findElements(By.tagName("a"));
		 
		 for(int i=0;i<Links.size();i++)
		 {
		  	 System.out.println(i +" : "+ Links.get(i).getText());
		 }
		 
		 driver.close();
}
}