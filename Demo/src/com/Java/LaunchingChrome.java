package com.Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BNawa\\Downloads\\Testing\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://amazon.co.uk");	
   driver.findElement(By.id("nav-link-accountList")).click();
   driver.findElement(By.name("email")).sendKeys("hnawabpet@gmail.com");
   driver.findElement(By.id("continue")).click();
   driver.findElement(By.id("ap_password")).sendKeys("Harry009");
   driver.findElement(By.id("signInSubmit")).click();
   
   System.out.println("Amazon account login sucessfully......");*/
 driver.get("https://www.google.co.uk/");
        
        driver.findElement(By.name("q")).sendKeys("testing");
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='lnnVSe']"));
        System.out.println(list.size());
        
   }
   
}
