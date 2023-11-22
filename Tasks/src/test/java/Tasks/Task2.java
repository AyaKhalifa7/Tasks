package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.HomePage; 
import Pages.Signup;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ExcelUtils;
import utility.ForExcel;

public class Task2 {
	private static WebDriver driver = null;
	public Task2() throws Exception {
//	    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();

	         }
	@BeforeTest
	public void setup() throws Exception {
	     Dashboard Dp=new Dashboard();
	     Dp.setup(driver);
	     ExcelUtils.setExcelFile("C:\\Users\\HP\\Desktop\\test\\Tasks\\Data" + "\\data.xlsx", "Sheet1");
	} 
	@Test(priority = 1)
	public void signClick() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.ClickOnSignIn(driver);
	}
	@Test(priority = 2)
	public void SignUP() throws Exception {
		Signup s=new Signup();
		s.clickk(driver);
		ForExcel f=new ForExcel();
		f.Excel(driver);
	
	}
 
 
	@AfterTest
	public void close() {
	 
//	driver.quit();
	} 
}
