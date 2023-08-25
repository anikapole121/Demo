package com.Java;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BNawa\\Downloads\\Testing\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
        driver.get("https://www.google.co.uk/");
        
        driver.findElement(By.name("q")).sendKeys("testing");
	}

}
