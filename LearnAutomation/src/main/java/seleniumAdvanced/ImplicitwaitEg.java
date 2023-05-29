package seleniumAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Better than Tread.sleep 
		//Implicit Wait, will not bother if the element is hidden or can be interacted.
		//If the element is present in the DOM, it will immediately release the wait and will start performing the further 
		//We cannot mention any explicit condition to be met before performing any operation using Implicit Wait.
		//Implicit Wait is applicable for all the web elements found using the web driver until driver.quit() is encountered
		
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
		
		WebElement profile= driver.findElement(By.
				xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a"));
		profile.click();
		
		driver.quit();
	}
}
