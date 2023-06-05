package com.basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		//5: by name
		
		//driver.findElement(By.name("firstname")).sendKeys("Testing typing");
		
		//6. tagName
		
		driver.findElement(By.tagName("button")).click();
		
		
	}

}
