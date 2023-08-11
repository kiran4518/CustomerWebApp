package Com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws Exception
	{
		String excelPath="/home/mintifi/eclipse-workspace/kiran/CustomerWebApp2/TestData/TestData.xlsx";
		 String filename="TestData";
		  String sheetname="Test";
		  
		  
		  File file= new File(excelPath);;
		  
		  FileInputStream fis= new FileInputStream(file);
		  
		  XSSFWorkbook wd= new XSSFWorkbook(fis);
		  XSSFSheet sheet=wd.getSheet(sheetname);
		  
		 int rowCount=sheet.getLastRowNum();
		 
		 System.out.println("Total number  :" +rowCount );
	
	String	data =  sheet.getRow(0).getCell(1).getStringCellValue();
	// how to get the particular data
	
  System.out.println(data);
	
     for(int i=0;i<=rowCount;i++)
     {
       Row row= sheet.getRow(i);
       
       for(int j=0;j<row.getLastCellNum();j++)
       {
    	  String data1=sheet.getRow(i).getCell(j).getStringCellValue();
    	  
    	  System.out.print(data1+" ");
       }
       System.out.println();
     }
  
	}
	
}
