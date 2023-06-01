package seleniumAdvanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Steps to take Screenshot using TakesScreenshot interface:
			----------------------------------------------------------------------------------------------
			1. Using Selenium's TakesScreenshot 
			2. call GetScreenshotAs method and store it in a file
			3. Create an image file in any location
			4. copy the screenshot in destinationFile (image) file, using FileUtils.(commons-io) 
			or we can use Selenium's FileHandler as well to copy the file.

			Steps to take Screenshot using Robot class:
			-----------------------------------------------------------------------
			1) Create an object of Robot class.
			2) Get the screen size and store.
			3) Use the Rectangle class and pass the screen size.
			4) Use createScreenCapture(rectangle) of Robot class and capture screenshot. (source) 
			5) Define destination path file for the screenshot.
			6) Write temp file into the destination file. (ImageIO)
			*/
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://phptravels.net/login");
		
		
		WebElement language = driver.findElement(By.id("languages"));
		language.click();
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/ul/li[9]/a")).click();
		
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		//Take screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     
        try {
            FileUtils.copyFile(screenshot, new File("D:\\vinoth.b06\\Selenium\\WorkSpace\\LoginPage.png"));
            } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
		
		
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		submit.click();
	}

}
