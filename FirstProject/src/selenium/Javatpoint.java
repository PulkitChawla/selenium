package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Javatpoint {
	
	@Test
	public void fun() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  ChromeOptions options= new ChromeOptions();
		  options.addArguments("--disable-notifications");
	      driver=new ChromeDriver(options); 
	      
	      driver.get("https://www.javatpoint.com/");
	      Thread.sleep(2000);
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      
	      Actions actions=new Actions(driver);
	   
	      WebElement home=driver.findElement(By.linkText(" //*[@id=\"link\"]/div/ul/li[1]/a"));
	      actions.moveToElement(home);
	      Thread.sleep(5000);
	      
	      WebElement python=driver.findElement(By.linkText("//*[@id=\\\"link\\\"]/div/ul/li[2]/a"));
	      actions.moveToElement(python);
	      Thread.sleep(5000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath(""));
//	      Thread.sleep(2000);
	}

}
