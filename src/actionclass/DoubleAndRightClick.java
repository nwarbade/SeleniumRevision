package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.BaseTest;

public class DoubleAndRightClick {
	
public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClickButton).perform();  // double click	
		
//		act.contextClick(doubleClickButton).perform();  // right click
		
		
	}

}
