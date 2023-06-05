package com.basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		
//		1: id locator
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
//		
		searchbox.sendKeys("Mobile");
		
//		2: class locator
		
//	WebElement searchbutton	= driver.findElement(By.className("nav-line-1"));
//		
//	searchbutton.click();
		
//		3: linkText
	
	//WebElement seemorelink= driver.findElement(By.linkText("See more"));
	
	//seemorelink.click();
		
//		4: partiallinktext
		
		driver.findElement(By.partialLinkText("all offers")).click();
		

}
}
