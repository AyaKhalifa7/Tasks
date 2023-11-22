package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.ExcelUtils;

public class Product {
	WebDriver driver;
	public Product(WebDriver driver) {
		 driver=this.driver;
	}
  public void ChooseRandom(WebDriver driver)  throws Exception {
	  ExcelUtils ex=new ExcelUtils();
		String[] arr = {"Oris Dat Watt Limited Edition II 43.5mm Watch, Green Dial", "Frasier Fir Novelty Holiday Gift Set", "Festive Folly Penguin"};
	  Random random = new Random();
      int randomIndex = random.nextInt(arr.length);
 
      String name = arr[randomIndex];
      
	  System.out.println("arr: "+name); 
 	  Thread.sleep(2000);  
	  driver.findElement(By.xpath("//*[@id=\"l-desktop-search\"]")).sendKeys(name);//name
	  
	  switch (name) {
      case "Oris Dat Watt Limited Edition II 43.5mm Watch":
    	  driver.get("https://www.borsheims.com/oris-dat-watt-limited-edition-ii-435mm-watch-green-dial?list=autocomplete");
          break;
      case "Frasier Fir Novelty Holiday Gift Set":
    	  driver.get("https://www.borsheims.com/thymes-frasier-fir-novelty-holiday-gift-set?list=autocomplete");
      break;
      case "Festive Folly Penguin":
    	  driver.get("https://www.borsheims.com/jellycat-festive-folly-penguin?list=search");
    break;}
	   
		 Thread.sleep(5000); 
		if(driver.findElement(By.xpath("//*[@id=\"js-product-title\"]")).getText().equals(name)) {
 //	 driver.findElement(By.xpath("//*[@id=\"js-product-title\"]")).equals(name);
		 driver.findElement(By.xpath("//*[@id=\"js-add-to-cart\"]")).click();
		 Thread.sleep(3000); 
  		 driver.findElement(By.xpath("//*[@id=\"js-mini-basket\"]")).click();
  		ex.setCellData("Passed",0,0);
		}
		else {
			ex.setCellData("Failed",0,0);
		}
 	 
		 
	  
	  
	  
  } 
}

