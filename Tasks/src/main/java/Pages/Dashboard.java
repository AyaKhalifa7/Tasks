package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

//import utility.Constant;
import utility.ExcelUtils;
 

public class Dashboard { 
	public void setup(WebDriver driver) throws Exception { 
		

		driver.get("https://www.borsheims.com/");
	    driver.manage().window().maximize();
	    driver.getWindowHandle();
		    try {
		      
		        TimeUnit.SECONDS.sleep(10);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
	}
}
