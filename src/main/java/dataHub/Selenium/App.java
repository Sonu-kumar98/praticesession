package dataHub.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
    	Thread.sleep(5000);
    	WebDriver driver = new ChromeDriver();
    	 driver.navigate().to("https://demoqa.com/automation-practice-form/");
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

    	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Let the user actually see something!     

    	  WebElement searchBox = driver.findElement(By.name("q"));

    	  searchBox.sendKeys("ChromeDriver");     

    	  searchBox.submit();    
  // Let the user actually see something!     

    	  driver.quit(); 
    	
    }
}
