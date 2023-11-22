package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		 driver=this.driver;
	} 
	public void ClickOnSignIn	(WebDriver driver) throws InterruptedException {
 		driver.findElement(By.xpath("//*[@id=\"js-header\"]/div[1]/div/div[3]/a")).click();
  	 
        Thread.sleep(2000);
 
	}
}
