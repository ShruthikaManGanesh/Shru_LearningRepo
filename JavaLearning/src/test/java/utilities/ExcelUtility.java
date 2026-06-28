package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public void readExcel(String filePath,String Sheet) throws IOException {
		try {
			FileInputStream file=new FileInputStream(filePath);
			XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet(Sheet);
			for(int i=1;i<=sheet.getPhysicalNumberOfRows();i++) {
				 XSSFRow row = sheet.getRow(i);
				int columnCount=row.getLastCellNum();
				
				for(int j=0;j<columnCount;j++) {
					DataFormatter formatData=new DataFormatter();
					 Object cellValue = formatData.formatCellValue(row.getCell(j));
					 System.out.println("Row: "+i+" and Column: "+j+" Value is: "+cellValue);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
