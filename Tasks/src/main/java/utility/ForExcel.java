package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import Pages.Signup;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ForExcel {
public void Excel(WebDriver driver) throws Exception { 
	   Object[][] data = null;
	    try (Workbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\HP\\Desktop\\test\\Tasks\\Data" + "\\data.xlsx"))) {
	        Sheet sheet = workbook.getSheetAt(0);
	        int rowCount = sheet.getPhysicalNumberOfRows();
	        data = new Object[rowCount][11];
	        Signup s=new Signup();
	        for (int i = 0; i < rowCount-1; i++) {	  
	            Row row = sheet.getRow(i+1);
	            Cell cell0 = row.getCell(0);
	            Cell cell1 = row.getCell(1);
	            Cell cell2 = row.getCell(2);
	            Cell cell3 = row.getCell(3);
	            Cell cell4 = row.getCell(4);
	            Cell cell5 = row.getCell(5);
	            Cell cell6 = row.getCell(6);
	            Cell cell7 = row.getCell(7);
	            Cell cell8 = row.getCell(8);
	            Cell cell9 = row.getCell(9);
	            Cell cell10 = row.getCell(10);  
	            	if (cell0.getCellType() == CellType.STRING) {
	                data[i][0] = cell0.getStringCellValue();
	                System.out.println("data[i][0]: "+data[i][0]);
	            }  
	            if (cell1.getCellType() == CellType.STRING) {
	                data[i][1] = cell1.getStringCellValue();
	                System.out.println("data[i][1]: "+data[i][1]);
	            }
	             if (cell2.getCellType() == CellType.STRING) {
	                data[i][2] = cell2.getStringCellValue();
	                System.out.println("data[i][2]: "+data[i][2]);
	            }
	             if (cell3.getCellType() == CellType.STRING) {
	                data[i][3] = cell3.getStringCellValue();
	                System.out.println("data[i][3]: "+data[i][3]);
	            }
	             if (cell4.getCellType() == CellType.STRING) {
	                data[i][4] = cell4.getStringCellValue();
	                System.out.println("data[i][4]: "+data[i][4]);
	            }
	             if (cell5.getCellType() == CellType.STRING) {
	                data[i][5] = cell5.getStringCellValue();
	                System.out.println("data[i][5]: "+data[i][5]);
	            }
	            if (cell6.getCellType() == CellType.NUMERIC) {
	                data[i][6] = (int)cell6.getNumericCellValue();
	                System.out.println("data[i][6]: "+data[i][6]);
	            }
	            if (cell7.getCellType() == CellType.STRING) {
	                data[i][7] = cell7.getStringCellValue();
	                System.out.println("data[i][7]: "+data[i][7]);
	            }
	              if (cell8.getCellType() == CellType.STRING) {
	                data[i][8] = cell8.getStringCellValue();
	                System.out.println("data[i][8]: "+data[i][8]);
	            }
	              if (cell9.getCellType() == CellType.STRING) {
	                data[i][9] = cell9.getStringCellValue();
	                System.out.println("data[i][9]: "+data[i][9]);
	            }
	              if (cell10.getCellType() == CellType.NUMERIC) {
	                data[i][10] = (int)cell10.getNumericCellValue();
	                System.out.println("data[i][10]: "+data[i][10]);
	            }  	            	
	            	s.SignUp(data[i][0].toString(), data[i][1].toString(), data[i][2].toString(), data[i][3].toString(),data[i][4].toString(), data[i][5].toString(),data[i][6].toString(), data[i][7].toString(), data[i][8].toString(), data[i][9].toString().trim(), data[i][10].toString(), driver);
	            ExcelUtils.setCellData("X", i + 1, 11);
	            
	            if(driver.findElement(By.xpath("//*[@id=\"js-header\"]/div[1]/div/div[3]/a")).isDisplayed()) {
	            driver.findElement(By.xpath("//*[@id=\"js-header\"]/div[1]/div/div[3]/a")).click();
	            Thread.sleep(10000);
	            driver.findElement(By.xpath("//*[@id=\"js-main-content\"]/div/div[1]/div/div/p/a")).click();
	            ExcelUtils.setCellData("Passed", i + 1, 12);
	            }
	            else {
	            	ExcelUtils.setCellData("Failed", i + 1, 12);
	            }
	            System.out.println("time-1");
	            Thread.sleep(6000);
	            if(i!=rowCount-2) {
	            	if(driver.findElement(By.xpath("//*[@id=\"js-header\"]/div[1]/div/div[3]/a")).isDisplayed())
	            	{ System.out.println("time100"); 
	            	driver.findElement(By.xpath("//*[@id=\"js-header\"]/div[1]/div/div[3]/a")).click();
	            	s.clickk(driver);
	            	}
	            }
	            
//	            }
	            System.out.println("time0");
	        	Thread.sleep(10000);
	        	 System.out.println("time1");

	        } 
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	Thread.sleep(3000);
 
}
}

