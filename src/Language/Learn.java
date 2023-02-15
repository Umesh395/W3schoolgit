package Language;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Learn {



public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
     
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.W3Schools.com");

//	Thread.sleep(3000);
	//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
     String url=driver.getCurrentUrl();
     System.out.println(url);
     String title = driver.getTitle();
     System.out.println(title);
     
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,4000)");    // Scroll down
	//Thread.sleep(2000);
	//js.executeScript("window.scrollBy(0,-4000)");     //scroll up
	//Thread.sleep(2000);
	//js.executeScript("window.scrollBy(100,0)");      // scroll right
	//Thread.sleep(2000);
	//js.executeScript("window.scrollBy(-100,0)");     // scroll left
	
	WebElement greenButton = driver.findElement(By.xpath("(//a[text()='Learn SQL'])[2]"));
	JavascriptExecutor js2 = (JavascriptExecutor)driver;
	js2.executeScript("arguments[0].scrollIntoView(true)", greenButton);
	//Thread.sleep(5000);
	
	WebElement learnSql = driver.findElement(By.xpath("(//a[text()='Learn SQL'])[2]"));
	learnSql.click();
	//Thread.sleep(2000);
	
	WebElement tryYourself = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
	tryYourself.click();
	
     ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
	
	driver.switchTo().window(addr.get(1));
	System.out.println(driver.getCurrentUrl());

	WebElement runSql = driver.findElement(By.xpath("//button[text()='Run SQL »']"));
	runSql.click();
//	Thread.sleep(5000);
	
	//WebElement pageframe = driver.findElement(By.xpath("//iframe[@id='adg-2-sync']"));
    //driver.switchTo().frame(pageframe);
    //JavascriptExecutor js1 = (JavascriptExecutor)driver; 
	//Thread.sleep(5000);
	//js1.executeScript("window.ScrollBy(0,100)");
	//Thread.sleep(5000);
//	js1.executeScript("window.scrollBy(0,100)");
	//Thread.sleep(5000);
	
	TakesScreenshot take = (TakesScreenshot)driver;
	File source = take.getScreenshotAs(OutputType.FILE);
	File  dest = new File("C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\Screenshots\\Customers.jpeg");
	FileHandler.copy(source,dest);
	
	ArrayList<String> back = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(back.get(0));
	
	driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
	
	WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	alert.click();
	//Thread.sleep(2000);
	
	ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr1.get(2));
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult'] "));
	driver.switchTo().frame(iframe);
	WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
	tryIt.click();
	//Thread.sleep(5000);
	
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
	//driver.switchTo().alert();
	TakesScreenshot take1 = (TakesScreenshot)driver;
	File source1 = take1.getScreenshotAs(OutputType.FILE);
	File dest1 = new File ("C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\Screenshots\\Alert.jpeg");
	FileHandler.copy(source1, dest1);
	
	
	

	
	
	
	
}
	
	
	
	                                                   
}
