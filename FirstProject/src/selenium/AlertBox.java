package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertBox 
{
	WebDriver driver;
	
	@Test
    public void signIn() throws InterruptedException  {
		  //System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\FirstProject\\chromedriver_win32\\chromedriver.exe");  
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions options= new ChromeOptions();
		  options.addArguments("--disable-notifications");
	      driver=new ChromeDriver(options); 
	     
	      driver.get("https://vicky.buzy-bee.com");
	      driver.manage().window().maximize();
  	      driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).click();
  	      driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("7678589395");
          driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).click();
          driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("767395");
          driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div/div/div[2]/i")).click(); // button pointing   //*[@mattooltip='Categories']/i
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div/div/div[3]/i")).click();  //media offer xpath //*[@mattooltip='Media-Order']/i
          Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-media-order/div/div[2]/speed-dial-fab/div/button")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-media-order/div/div[2]/speed-dial-fab/div[2]/button/span[1]/i")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div/div/div[4]/i")).click();
          Thread.sleep(2000);
         // System.out.println("aaaaaaaaaaaaaaaaaaa");
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-cart/div/div/div/button/span[1]/span")).click();
          Thread.sleep(5000);
         // System.out.println("aaaaaaaaaaaaaaaaaaa");
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-dashboard/app-category/div/div[1]/div/mat-grid-list/div/mat-grid-tile[1]/figure/a/span[1]/span/div/img")).click();
          Thread.sleep(3000);
         // System.out.println("aaaaaaaaaaaaaaaaaaa");
          driver.findElement(By.xpath("/html/body/app-root/app-home/app-products/div[3]/div/div[2]/mat-card/button/span[1]/mat-icon")).click();
          //driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div/div/div[4]/i")).click();
         // driver.findElement(By.xpath("//*[@alt='Sanitizer']")).click();
         // System.out.println("aaaaaaaaaaaaaaaaaaa");
          //driver.findElement(By.xpath("/html/body/app-root/app-home/app-cart/div/div[2]/div/mat-grid-list/div/mat-grid-tile[2]/figure/button/span[1]/strong")).click();
         // driver.findElement(By.xpath("(//*[@id='buttonId'])[1]")).click();
          
         // System.out.println("1111111111111111111111111111111111111111111111111111111");
         // Alert alert= driver.switchTo().alert();
          Thread.sleep(2000);
         // System.out.println("111111122222222222222222222222222222222222222222221111111");
          //System.out.println(alert.getText());
          try {
        	  driver.findElement(By.xpath("//*[text()='Cancel']")).click();
          }
          catch(Exception e)
          {
        	  Actions action = new Actions(driver);
        	  WebElement findElement = driver.findElement(By.xpath("//*[text()='Cancel']"));
			action.moveToElement(findElement).click().perform();        	  }
         // System.out.println("11111112222222222222333333333333333333333333333333333333333333333222221111111");
         // driver.findElement(By.xpath("//*[@id="mat-dialog-0"]/app-store-status-dialog/mat-dialog-actions/button")).click();
          								//*[@id="mat-dialog-0"]/app-store-status-dialog/mat-dialog-actions/button
         // driver.findElement(By.xpath("//*[text()='Cancel']")).click();
          driver.close();
	
	}
}