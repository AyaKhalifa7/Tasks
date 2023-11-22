package Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Product;
//import utility.ForExcel;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ExcelUtils;

 
public class Task1 
{
	private static WebDriver driver = null;
	public Task1() throws Exception {
//	    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();

	         }
	@BeforeTest
	public void setup() throws Exception {
	     Dashboard Dp=new Dashboard();
	     Dp.setup(driver);
	     ExcelUtils.setExcelFile("C:\\Users\\HP\\Desktop\\test\\Tasks\\Data" + "\\data.xlsx", "Sheet2");
	} 
	@Test(priority = 1)
	public void signClick() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.ClickOnSignIn(driver);
	}
	@Test(priority = 2)
	public void Login() throws InterruptedException {
		LoginPage l=new LoginPage(driver);
		l.SignIn( driver);
	}
	@Test(priority = 3)
	public void Search() throws Exception { 
		Product p=new Product(driver);
		p.ChooseRandom(driver);
	} 
	@AfterTest
	public void close() {
	 
	driver.quit();
	}  
	
    
}
