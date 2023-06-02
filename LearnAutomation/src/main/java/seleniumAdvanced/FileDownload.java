package seleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement Download = driver.findElement(By.id("j_idt93:j_idt95"));
		Download.click(); 	
		
File fileLocation= new File("C:\\Users\\LENOVO\\Downloads");
		
		File[] totalFiles=fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("TestLeaf Logo.png")){
				System.out.println("File is downloaded");
				break;
	}
		}
		}
	}
