package testCases;

import java.io.IOException;

import utilities.ExcelUtility;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		String filePath="./data/TestData.xlsx";
		String sheetName="LoginData";
		ExcelUtility excelread= new ExcelUtility() ;
		excelread.readExcel(filePath, sheetName);
	}
}
