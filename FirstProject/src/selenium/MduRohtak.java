package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MduRohtak {
	
	@Test
	public void task() throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver;
		  ChromeOptions options= new ChromeOptions();
		  options.addArguments("--disable-notifications");
	      driver=new ChromeDriver(options); 
		  driver.manage().window().maximize();
		 
	      
	      driver.get("https://mdu.ac.in/");
	      Thread.sleep(2000);
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
//	      driver.findElement(By.xpath("//*[@a='rmLink']")).click();
//	      Thread.sleep(2000);
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,650)", "");
	      Thread.sleep(2000);
	      Actions actions=new Actions(driver);
	      
	      actions.contextClick().perform();
	      Thread.sleep(4000);
	      
	      
	      
	      WebElement menu= driver.findElement(By.xpath("//*[text()='Home'][1]"));
	      actions.moveToElement(menu);
	      System.out.println("One");
	      Thread.sleep(2000);
	      
	      WebElement academics=driver.findElement(By.xpath("//*[text()='Academics'][1]"));
	      actions.moveToElement(academics);
	      System.out.println("Two");
	      Thread.sleep(2000);
	      
	      WebElement profile=driver.findElement(By.xpath("(//*[text()='University Profile'])[1]"));
	      actions.moveToElement(profile);
	      System.out.println("Three");
	      Thread.sleep(2000);//working till here
	      
	      WebElement admin=driver.findElement(By.xpath("(//*[text()='Administration'])[1]"));
	      actions.moveToElement(admin);
	      System.out.println("Four");
	      Thread.sleep(2000);
	      
	      WebElement facility=driver.findElement(By.xpath("(//*[text()='Central Facilities'])[1]"));
	      actions.moveToElement(facility);
	      System.out.println("FIve");
	      Thread.sleep(2000);
	      
	      WebElement admission=driver.findElement(By.xpath("(//*[text()='Admissions'])[1]"));
	      actions.moveToElement(admission);
	      System.out.println("Six");
	      Thread.sleep(2000);
	      
	      WebElement exam=driver.findElement(By.xpath("(//*[text()='Examinations'])[1]"));
	      actions.moveToElement(exam);
	      System.out.println("Seven");
	      Thread.sleep(2000);
	      
	      WebElement library=driver.findElement(By.xpath("(//*[text()='Library'])[1]")); 
	      actions.moveToElement(library);
	      System.out.println("Eight");
	      Thread.sleep(2000);
	      
	      JavascriptExecutor js1 = (JavascriptExecutor) driver;
	      js1.executeScript("window.scrollBy(0,1000)", "");
	      Thread.sleep(2000);
	      
	      WebElement message=driver.findElement(By.xpath("//*[text()='VC Message']"));
	      actions.moveToElement(message);
	      System.out.println("Nine");
	      Thread.sleep(3000);
	      
	      WebElement vision=driver.findElement(By.xpath("//*[text()='Vision']"));
	      actions.moveToElement(vision);
	      System.out.println("Ten");
	      Thread.sleep(3000);
	      
	      WebElement mission=driver.findElement(By.xpath("//*[text()='Mission']"));
	      actions.moveToElement(mission);
	      System.out.println("11");
	      Thread.sleep(3000);
	      
	      WebElement values=driver.findElement(By.xpath("//*[text()='Values']"));
	      actions.moveToElement(values);
	      System.out.println("12");
	      Thread.sleep(3000);
	      
	      WebElement strategicPlan=driver.findElement(By.xpath("//*[text()='Strategic Plan']"));
	      actions.moveToElement(strategicPlan);
	      System.out.println("13");
	      Thread.sleep(3000);
	      
	      WebElement codeofEthics=driver.findElement(By.xpath("//*[text()='Code of Ethics']"));
	      actions.moveToElement(codeofEthics);
	      System.out.println("14");
	      Thread.sleep(3000);
	      
	      JavascriptExecutor js2=(JavascriptExecutor)driver;
	      js2.executeScript("window.scrollBy(0,6000)", "");
	      Thread.sleep(3000);
	      
	      JavascriptExecutor js3=(JavascriptExecutor)driver;
	      js3.executeScript("window.scrollBy(6000,0)", "");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("(//*[text()='University Profile'])[1]")).click();
	      System.out.println("15");
	      Thread.sleep(6000);//going till here
	      
	      //code for going back to main page
	      
	     // driver.navigate().back();
	      
	      //if not work then take xpath of home page
	    
	      driver.findElement(By.xpath("(//*[text()='Annual Reports'])")).click();
	      System.out.println("16");
	      Thread.sleep(2000);
	      
	      //Question ---> How to back to main page??
	      //try this
	      driver.navigate().back();
	      
	      driver.findElement(By.xpath("(//*[text()='Administration'])")).click();
	      System.out.println("17");
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("(//*[text()='Examinations'])[1]")).click();
	      System.out.println("18");
	      Thread.sleep(2000);
	      
	      
	      
	      
//	      driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[1]/a")).click();
//	      driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]/a")).click();
//	      driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[3]/a")).click();
//	      driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[4]/a")).click();
//	      driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[5]/a")).click();
	}
}