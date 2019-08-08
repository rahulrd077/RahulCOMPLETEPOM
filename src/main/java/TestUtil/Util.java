package TestUtil;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Xyphias.QA.RahulCompletePOM.TestBase;

public class Util extends TestBase{
	
	public static String TEST_DATA_SHEET_PATH = "D:\\Eclipse Workspace\\RahulCompletePOM\\src\\main"
			+ "\\java\\com\\Xyphias\\QA\\TestData\\FreeCRM.xlsx" ;
	
	public static long IMPLICITLY_WAIT = 30 ;
	public static long PAGELOAD_TIMEOUT = 30 ;
	
	public static Sheet sheet;
	
	public static Workbook workbook;
	public void switchframes() {
		
		driver.switchTo().frame("mainpanel"); 
	}


	public static Object[][] getTestData1(String sheetName){
		
		FileInputStream file = null ;
		
		try {
			
		 file = new FileInputStream(TEST_DATA_SHEET_PATH);
		 
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		 
		 
		}
		
		try {
			
			workbook = WorkbookFactory.create(file);
		}
		
catch(Exception e) {
			
			e.printStackTrace();
		 
		 
		}
		
		sheet= workbook.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		//  System.out.println(sheet.getLastRowNum() + "-------" + sheet.getRow(0).getLastCellNum());
		//  0
		
		for(int i = 0 ;i < sheet.getLastRowNum() ; i++ ) {
			
			for(int j = 0 ;j < sheet.getRow(0).getLastCellNum() ; j++ ) {
				
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				
				
				
				// System.out.println(data[i][j]);
			}
			
			
		}
				
		
		return data;
	}
	
	
	
	
	
}
