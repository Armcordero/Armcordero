package utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
		static XSSFWorkbook workbook;
		static XSSFSheet sheet;
		
		
	public ExcelUtil (String excelPath, String sheetName ) {
		
			try {
				
				workbook = new XSSFWorkbook (excelPath) ;
				sheet = workbook.getSheet(sheetName);
				
			}
			catch (Exception exp) {
				exp.printStackTrace();		
			}
			
	}
		
	public static void main(String[] args) {
			
			//getRowCount();
			//getColCount();
			//getCellCountString(0,1);
			//getCellCountNumeric(1,1);
		}
	
	public static  int getRowCount() {
			
			int rowCount=0;
			
			try {
				
				rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				//rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("No. of Rows: " + rowCount);
			
			}  
			catch (Exception exp) {
				
				//System.out.println(exp.getMessage());
				//System.out.println(exp.getCause());
				exp.printStackTrace();
			
			}
			return rowCount;
			
	}
		
	public static int getColCount() {
	
		int colCount = 0;
		
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of Column: " + colCount);
		
		}  
		catch (Exception exp) {
			
			//System.out.println(exp.getMessage());
			//System.out.println(exp.getCause());
			exp.printStackTrace();
		
		}
		
		return colCount;
	}
	
	public static String getCellCountString (int rowNum, int colNum) {
		
		String cellCount = null;
		DataFormatter formatter = new DataFormatter ();
		try {
			
			cellCount = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
//			cellCount = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellCount);
					
		} catch (Exception exp) {
			
			//System.out.println(exp.getMessage());
	    	//System.out.println(exp.getCause());
			exp.printStackTrace();
		
		}
		return cellCount;
	}
	
	/** public static double getCellCountNumeric(int rowNum, int colNum) { 
		
		double cellCountNumeric = 0.0;
		
		try {
			
			cellCountNumeric = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellCountNumeric);
			
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		
		}
		return cellCountNumeric;
	} */
}
