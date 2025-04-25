package HotelBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBookingTest {
	public static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co =new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.get("https://www.makemytrip.com/hotels/");
		
		
		
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		 try {  
		        WebElement closePopup = driver.findElement(By.cssSelector("span[data-cy='closeModal']"));  
		        closePopup.click();
		    } catch (Exception e) {  
		        System.out.println("No popup found.");  
		    }  
		 driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/span/a/span[1]/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/label/span")).click(); 
		 
	  driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div/div/div[1]/input")).sendKeys("Mumbai");
		 
	  Thread.sleep(2000); 
	  WebElement firstSuggestion = driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/div/p/span/b"));
	  firstSuggestion.click();
	  
	  
	
	  WebElement checkIn = driver.findElement(By.id("checkin"));
	  checkIn.click();
	  
	  WebElement datein=driver.findElement(By.cssSelector("div[aria-label='Mon Apr 28 2025']"));
			  datein.click();

  WebElement checkOut = driver.findElement(By.id("checkout"));
  checkOut.click();
  WebElement dateout=driver.findElement(By.cssSelector("div[aria-label='Thu May 01 2025']"));
  dateout.click();

  WebElement room = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div"));
room.click();
driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[2]/button")).click();
//  
  driver.findElement(By.id("hsw_search_button")).click();
  
  

   //  Verify results  
	    WebElement results = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_locality\"]/p/span"));
		    if (results.isDisplayed()) {  
		        System.out.println("Hotel search successful.");  
		    } else {  
		        System.out.println("Hotel search failed.");  
		    }  
  Thread.sleep(3000);
		    driver.quit();  
	    }
}














