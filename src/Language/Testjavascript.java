package Language;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Testjavascript {

	public static void main(String[] args) throws IOException, InterruptedException {
		//*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	     
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert.click();
		Thread.sleep(2000);
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']")); 
		tryIt.click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		TakesScreenshot take1 = (TakesScreenshot)driver;
		File source1 = take1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File ("C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\Screenshots\\Alert5.jpeg");
		FileHandler.copy(source1, dest1);
		Thread.sleep(2000);
	
		
		

		
		
	}
	
	
	
	
	
}
