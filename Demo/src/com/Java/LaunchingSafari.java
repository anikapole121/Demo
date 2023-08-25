package com.Java;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;

public class LaunchingSafari {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new SafariDriver();
	        Thread.sleep(2000);
	        driver.get("https://amazon.co.uk");
	        String title =driver.getTitle();
	        System.out.println(title);
	}

}
