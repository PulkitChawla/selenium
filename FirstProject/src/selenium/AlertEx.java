package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AlertEx {
	@Test
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\FirstProject\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vicky.buzy-bee.com");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	 
}
}
