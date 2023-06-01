package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");

		//frame
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();

		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		//Nested Frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement button2= driver.findElement(By.id("Click"));
		button2.click();

		String text1=driver.findElement(By.id("Click")).getText();
		System.out.println(text1);

		driver.switchTo().defaultContent();

		//Number of Frames
		List<WebElement> totalFrames=	driver.findElements(By.tagName("iframe"));

		int size=	totalFrames.size();
		System.out.println(size);
	}

}
