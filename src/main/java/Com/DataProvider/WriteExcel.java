package Com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	
	public void WriteExcel(String sheetname, String cellValue, int row ,  int col) throws Exception
	{
		String excelpath="/home/mintifi/eclipse-workspace/kiran/CustomerWebApp2/TestData/TestData.xlsx";
		
		
		File file= new File(excelpath);
		
		FileInputStream fos = new FileInputStream(file);
		
		XSSFWorkbook wb= new XSSFWorkbook(fos);
		
		XSSFSheet sheet =wb.getSheet(sheetname);
		
		sheet.getRow(row).createCell(col).setCellValue(cellValue);
		
		
		 FileOutputStream Fos= new FileOutputStream(new File(excelpath));
		 
		 wb.write(Fos);
		 
		 
		 
				
	}

}
