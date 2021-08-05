package com.excel.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
public void getExcel(int rowindex,int columnindex) throws IOException   {
	File file=new File("./src/test/resources/Testing Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sht=wb.getSheet("NY branch");
	int totalrow=sht.getPhysicalNumberOfRows();
	for(int i=0;i<totalrow;i++) {
		if(i==rowindex) {
		Row row=sht.getRow(i);
		row.getLastCellNum();
		for(int a=0;a<row.getLastCellNum();a++) {
			if(a==columnindex) {
				Cell cell=row.getCell(a);
				System.out.println(cell);
			}
			
		}
	}
	}
	
}
public static void main(String[] args) throws IOException {
	new ReadExcel2().getExcel(2,2);
}
}