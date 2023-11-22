package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	public void clickk(WebDriver driver)  {
		  driver.findElement(By.xpath("//*[@id=\"js-main-content\"]/div/div[1]/div/div/div[3]/div[2]/p[2]/a")).click();
	}
  public void SignUp(String emailAddress,String pass,String confpass,String first,String last,String email,String phone,String address1,String city,String area ,String ZIP,WebDriver driver) throws InterruptedException {

 	  Thread.sleep(2000);
 
 	  System.out.println("hiiiiiiiii");
 
 	 Thread.sleep(1000);  
  	 driver.findElement(By.xpath("//*[@id=\"Customer_LoginEmail\"]")).sendKeys(emailAddress);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_Password\"]")).sendKeys(pass);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_VerifyPassword\"]")).sendKeys(confpass);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_ShipFirstName\"]")).sendKeys(first);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_ShipLastName\"]")).sendKeys(last);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"Customer_ShipEmail\"]")).sendKeys(email);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_ShipPhone\"]")).sendKeys(phone);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_ShipAddress1\"]")).sendKeys(address1);
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//*[@id=\"l-Customer_ShipCity\"]")).sendKeys(city);
 	 Thread.sleep(1000);  
	  WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"Customer_ShipStateSelect\"]"));  
	  
	 Thread.sleep(1000);   
     Select select = new Select(dropdown); 
     Thread.sleep(1000); 
     
 
     select.selectByVisibleText(area); //area 
     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[@id=\"l-Customer_ShipZip\"]")).sendKeys(ZIP);
 	 driver.findElement(By.xpath("//*[@id=\"shipping_fields\"]/div[14]/div/input")).click();
  }
}
