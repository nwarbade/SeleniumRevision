package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BaseTest;

public class AlertPopup {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseTest.initBrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='toPlaceName']")).click();
		
	String textonalertpopup = driver.switchTo().alert().getText();
	
	System.out.println(textonalertpopup);//Please select Leaving From.
	

	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
		
		
	
}

}
