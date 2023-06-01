package seleniumAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaitEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();				
		/*
a)We can mention any explicit condition to be met before performing any operation.
b) alertIsPresent() elementToBeClickable() elementToBeSelected() frameToBeAvaliableAndSwitchToIt()
c) performs very well when compared to implicit wait and is the widely used wait condition.
d) it is applicable for only the web elements found using the web driver wait and 
   has no control over other elements found normally.
		 */																
		driver.navigate().to("https://phptravels.net/login");


		WebElement language = driver.findElement(By.id("languages"));
		language.click();
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/ul/li[9]/a")).click();



		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		submit.click();


		WebDriverWait wait = new WebDriverWait(driver, 20);	

		WebElement profile=	wait.until(ExpectedConditions.elementToBeClickable(By.
				xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a")));	

		profile.click();

		driver.quit();
	}

}
