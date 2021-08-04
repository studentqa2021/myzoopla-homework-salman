
package com.excel.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public void getexceldata() throws IOException{
		
	File file=new File("./src/test/resources/Testing Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	//Apeche POI method to read excel
	//new or old==>.xlsx=poi new ==>xssf
	//1st step = read whole excel as book=Workbook
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	//XSSFSheet sht=wb.getSheetAt(1);
	XSSFSheet sht=wb.getSheet("NY branch");
	int totelrow =sht.getPhysicalNumberOfRows();
	//loop all rows
	for(int i=0;i<totelrow;i++) {
		Row row=sht.getRow(i);
		row.getLastCellNum();//Total column number
		//inside this loop start another loop for column
		for(int a=0;a<row.getLastCellNum();a++) {
			Cell cell=row.getCell(a);
			System.out.println(cell);
			
		}
		
		
		
	}
	}
public static void main(String[] args) throws IOException {
	new ReadExcel().getexceldata();
}
}
