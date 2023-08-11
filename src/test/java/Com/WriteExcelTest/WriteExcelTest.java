package Com.WriteExcelTest;

import org.testng.annotations.Test;

import Com.DataProvider.WriteExcel;

public class WriteExcelTest {
	
	WriteExcel obj= new WriteExcel();
	@Test
	public void writeExcel() throws Exception
	{
		obj.WriteExcel("Test","Kiran", 0, 2);
		
	}
	@Test
	public void writeExcel1() throws Exception
	{
		obj.WriteExcel("Test","Aryan", 1, 2);
		
	}

}


