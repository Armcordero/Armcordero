package utilities;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		 	
		String projectPath = System.getProperty("user.dir");
		ExcelUtil excel = new ExcelUtil (projectPath + "/Excel/Data.xlsx","Sheet1");
		
		excel.getRowCount();
		excel.getColCount();
		excel.getCellCountString(0, 0);
	//	excel.getCellCountNumeric(1, 1); 
		}
}
