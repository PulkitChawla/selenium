package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//public class Task 
//{
    //WebDriver driver;
//    	@Test
//        public void logIn() throws InterruptedException {
//    		System.setProperty("webdriver.chrome.driver", "G:\\eclipse-workspace\\FirstProject\\chromedriver-win32\\chromedriver.exe");
//    		driver=new ChromeDriver();
//    		driver.get("https://vicky.buzy-bee.com");
//        driver.findElement(By.id("//*[@id=\"mat-input-0\"]")).click();
//        driver.findElement(By.id("/html/body/app-root/app-login/div/mat-card/form/mat-form-field")).sendKeys("7678589395");//9871881925
//
//        driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("767395");
//        driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
//        //to perform Scroll on application using Selenium
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1400)", "");
//
//        driver.findElement(By.xpath("/html/body/app-root/app-home/app-dashboard/app-category/div/div[1]/div/mat-grid-list/div/mat-grid-tile[1]/figure/a/span[1]/span/div/img")).click();
//        driver.findElement(By.xpath("//*[@id=\"categoryId\"]"));
//
//        driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div/div/div[2]/i")).click();
//        driver.findElement(By.xpath("//[@id=\"buttonId\"]")).click();//[@id="buttonId"]
//
//        driver.findElement(By.xpath("*[@id=\"content\"]/div/div[1]/mat-card"));
//        Thread.sleep(2000);
//        Alert simpleAlert=driver.switchTo().alert();
//        String message=simpleAlert.getText();
//        System.out.println(message);
//        Thread.sleep(2000);
//		simpleAlert.accept();
//		Thread.sleep(2000);
//		simpleAlert.dismiss();
//		Thread.sleep(2000);
//		//driver.findElement(By.id("output")).sendKeys("Store Closed.Sorry For inconvenience");
//    }
//  }