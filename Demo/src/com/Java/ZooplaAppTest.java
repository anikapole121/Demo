package com.Java;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZooplaAppTest {

	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BNawa\\Downloads\\Testing\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://zoopla.co.uk");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='_1qzmny55 _16fktr8']")).sendKeys("London");
        
        Thread.sleep(3000); 
        //driver.findElement(By.xpath("//span[text()='Manage preferences']")).click();
        //Thread.sleep(2000);
        
        //driver.findElement(By.xpath("//span[text()='Save and Exit']")).click();
        //Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@data-testid='search-btn']")).click();
      //div[contains(text(),'Search')]
        driver.findElement(By.xpath("//p[normalize-space()='£1,150,000']")).click();
      
        
	}

}
