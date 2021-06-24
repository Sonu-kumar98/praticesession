package dataHub.Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplemantaionTime {

	public void automate() {
		try {

			System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.nykaa.com/");
			driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[text()='Account']")).click();

			// input[@type="email"]
			// input[@name="emailMobile"]
			// button[@type='submit']
			// input[@name='password']
			// button[@class='button big fill full small-button-seperator']
			//input[@name='password' or @type='text']
			//a[text()='makeup']
			// some changes implicit wait  time out
			
			//Instantiating Actions class
			Actions actions = new Actions(driver);
			
			driver.findElement(By.xpath("//input[@type='email']")).click();
			driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("raj536056@gmail.com");
			driver.findElement(By.xpath("//button[@type='submit']")).click();			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Noida@18");
			driver.findElement(By.xpath("//button[@class='button big fill full small-button-seperator ']")).click();
	
			//driver.findElement(By.xpath("//a[text()='makeup']")).click();
			
			// i am using explicit wait in selenium
			
			List<WebElement> List = driver.findElements(By.xpath("//li[@class=\"MegaDropdownHeadingbox\"]"));
					  
			  List<Integer> all_elements_text=new ArrayList<Integer>();
				List<Character> chars = new ArrayList<Character>();
//		        for(int i=1;i<=List.size();i++){
//		        	
//		        	all_elements_text.add(List.get(i).getText());
//		        	 System.out.println(List.get(i).getText());
//		           
//		        }
			
			Iterator<WebElement> itr = List.iterator();			
			while(itr.hasNext()) {
				 WebElement row = itr.next();
				 Thread.sleep(2000);
				 
					actions.moveToElement(row);					
					actions.build().perform();
					 
			}
			
			
	      WebElement element = driver.findElement(By.xpath("//a[text()='makeup']"));			
			// Hovering the make up element
			actions.moveToElement(element);		
			actions.build().perform();		
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Face"))).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ImplemantaionTime i = new ImplemantaionTime();
		i.automate();

	}

}
