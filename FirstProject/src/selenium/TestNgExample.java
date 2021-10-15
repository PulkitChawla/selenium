package selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample {
	

		WebDriver driver;
		String url = "https://vicky.buzy-bee.com";

		@BeforeTest
		public void setUp() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\customer-app-automation-test-script\\chromedriver_win32\\chromedriver.exe");
			// Create a map to store preferences
			Map<String, Object> prefs = new HashMap<String, Object>();
			Map<String, Object> mobileEmulation = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			mobileEmulation.put("deviceName", "Galaxy S5");
			// Create an instance of ChromeOptions
			ChromeOptions options = new ChromeOptions();
			// set ExperimentalOption - prefs
			options.setExperimentalOption("prefs", prefs);
			options.setExperimentalOption("mobileEmulation", mobileEmulation);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(url);
//			driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("7678589395");
//			Thread.sleep(1000);
//			//driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).sendKeys(Keys.ARROW_DOWN);
//			driver.findElement(By.xpath("//*[@id=\"buttonId\"]")).click();
//			
//			  
//			driver.findElement(By.id("mat-input-1")).click();
//		    driver.findElement(By.id("mat-input-1")).sendKeys("767395");

			    driver.findElement(By.id("mat-input-0")).click();
			    driver.findElement(By.id("mat-input-0")).sendKeys("7678589395");
			    driver.findElement(By.id("buttonId")).click();
			    driver.findElement(By.id("mat-input-1")).click();
			    driver.findElement(By.id("mat-input-1")).sendKeys("767395");
			    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
			    driver.findElement(By.id("bottom-bar")).click();
		}
		
		@Test
		public void testSignUp() {
			
			driver.findElement(By.xpath("")).click();
		}

}
