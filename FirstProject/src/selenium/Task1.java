package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
    WebDriver driver;//*[@id="buttonId"]
	
		// TODO Auto-generated method stub
		@Test
		public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\FirstProject\\chromedriver_win32\\chromedriver.exe");  
	    driver=new ChromeDriver(); 
	
        driver.get("https://vicky.buzy-bee.com");  
		
        driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).click();	//mat-input-0
        driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("7678589395");//9871881925	
       
        driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();	//   //[@id=\"buttonId\"]      //[@id="mat-input-1"] 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).click();
       
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("767395");//987925
        driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");
        Thread.sleep(2000);
		
        
       
        driver.findElement(By.xpath("/html/body/app-root/app-home/app-dashboard/app-category/div/div[1]/div/mat-grid-list"
        		                   + "/div/mat-grid-tile[1]/figure/a/span[1]/span/div/img")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.cssSelector("#buttonId")).click();
      
      //  driver.findElement(By.id("buttonId")).click();
       
        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage="Store Is Closed !!!";
        
        driver.switchTo().alert().getText(); // capture alert message
        
        alert.accept();
       // System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        
        alert.dismiss();
       
        
       //(driver).until(ExpectedConditions.elementToBeClickable(By.id("close"))).click();
//        driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
//        driver.findElement(By.cssSelector("#categoryId")).click();//xpath("//*[@id=\"categoryId\"]"));
//        driver.findElement(By.cssSelector("#buttonId")).click();
       // driver.findElement(By.cssSelector("#content > div > div:nth-child(1) > mat-card"));
       
//        driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div/div/div[2]/i")).click();
//        driver.findElement(By.xpath("//[@id=\"buttonId\"]")).click();//[@id="buttonId"]
//       
//        driver.findElement(By.xpath("*[@id=\"content\"]/div/div[1]/mat-card"));
       // Thread.sleep(2000);
//		Alert simpleAlert=driver.switchTo().alert();
//		String message=simpleAlert.getText();
//		System.out.println(message);
//		Thread.sleep(2000);
//		simpleAlert.accept();
//		Thread.sleep(2000);
//		
//		simpleAlert.dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.id("output")).sendKeys("Store Closed.Sorry For inconvenience");
		driver.quit();
		}
	}


////*[@id="mat-input-1"]