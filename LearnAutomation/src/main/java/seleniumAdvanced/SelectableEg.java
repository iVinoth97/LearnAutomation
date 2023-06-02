package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.leafground.com/list.xhtml");
		
		WebElement ListView = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[1]/div/div[1]"));
		ListView.click();

		List <WebElement> selectable= driver.findElements(By.xpath("//*[@id=\"j_idt88_content\"]/ul/li"));


		int listsize = selectable.size();
		System.out.println(listsize);

		
		//using Keyboard
		/*Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();*/
		
		//using Mouse
		Actions actions= new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
	}

}
