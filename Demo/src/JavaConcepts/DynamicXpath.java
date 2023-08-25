package JavaConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXpath {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BNawa\\Downloads\\Testing\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://freecrm.com/");
        
        driver.findElement(By.xpath("//a//span[text()='Log In']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anikapole121@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anika121");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Contacts']")).click();
      
        Thread.sleep(2000);
        
               
     driver.findElement(By.xpath("//a[text()='Jack N']//parent::td//preceding-sibling::td//div//input[@type='checkbox']")).click();
        
	}

}
