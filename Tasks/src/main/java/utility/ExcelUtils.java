package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row; 
public static void setExcelFile(String Path, String SheetName) throws Exception {
try { 
FileInputStream ExcelFile = new FileInputStream(Path); 
ExcelWBook = new XSSFWorkbook(ExcelFile);
ExcelWSheet=ExcelWBook.getSheet(SheetName);
} 
	catch (Exception e){
throw (e);
}
	} 
public static String getCellData(int RowNum, int ColNum) throws Exception{
try{
Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
String CellData = Cell.getStringCellValue();
return CellData;
}catch (Exception e){
return"";
}
} 
public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
  try {
      Row = ExcelWSheet.getRow(RowNum);
      if (Row == null) {
          Row = ExcelWSheet.createRow(RowNum);
      }
      Cell = Row.createCell(ColNum, CellType.BLANK); 
      if (Cell.getCellType() == CellType.BLANK) {
          Cell.setCellType(CellType.STRING);
      }
      Cell.setCellValue(Result); 
      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\HP\\Desktop\\test\\Tasks\\Data" + "\\data.xlsx");
      ExcelWBook.write(fileOut);
      fileOut.flush();
      fileOut.close();
  } catch (Exception e) {
      e.printStackTrace();
  }
}


 

}