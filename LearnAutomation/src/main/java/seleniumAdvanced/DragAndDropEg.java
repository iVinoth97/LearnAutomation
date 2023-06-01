package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
			
		WebElement Source = driver.findElement(By.id("form:drag"));
		WebElement Target = driver.findElement(By.id("form:drop"));
		
		Actions actions = new Actions(driver);
		//actions.clickAndHold(Source).moveToElement(Target).release(Target).build().perform();
		actions.dragAndDrop(Source, Target).build().perform();
	}

}
