package com.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "");
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(2000);
        driver.get("https://amazon.co.uk");
        String title =driver.getTitle();
        System.out.println(title);
        
        //validation point
        if(title.equals("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more")) {
       
        System.out.println("title is correct");
        }
        else {
        	System.out.println("title is incorrect");
        }
        
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        
        driver.quit();
	}

}
