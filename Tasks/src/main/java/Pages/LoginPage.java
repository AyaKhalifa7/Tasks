package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		 driver=this.driver;
	}
	
		public void SignIn (WebDriver driver) 
				throws InterruptedException {
			Thread.sleep(4000);
			 driver.findElement(By.xpath("//*[@id=\"l-Customer_LoginEmail\"]")).sendKeys("aya.b.khalifa@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"l-Customer_Password\"]")).sendKeys("Fk9rKwuKS@Rc@@9");
			 Thread.sleep(1000); 
			 driver.findElement(By.xpath("//*[@id=\"js-logn-form\"]/div[3]/input")).click();
 
		     
	}
	 
}
