package com.selenium.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel operations
public class ExcelOperationsPractice {
public static XSSFWorkbook wb;
public static XSSFSheet sh;
public static XSSFRow row;
public static XSSFCell cell;
public static void setExcel(String excelPath,String sheetName) throws IOException {
File file = new File(excelPath);
	
FileInputStream inputStream = new FileInputStream(file);
wb = new XSSFWorkbook(inputStream);
sh= wb.getSheet(sheetName);
sh =wb.getSheet("Sheet1");
}
public static String getCellData(int rowNum,int colNum) {
cell =sh.getRow(rowNum).getCell(colNum);
return cell.getStringCellValue();
}
public static void setCellValue(String excelPath, int rowNum,int colNum,String cellValue) throws
IOException {
sh.getRow(rowNum).createCell(colNum).setCellValue(cellValue);
//sh.createRow(rowNum).createCell(colNum).setCellValue(cellValue);
FileOutputStream outputStream = new FileOutputStream(excelPath);
wb.write(outputStream);
}
public static int rowCount() {
	int noOfRows =sh.getLastRowNum()-sh.getFirstRowNum();
	return noOfRows;
	
}
public static void main(String[] args) throws IOException {
String path ="D://TestDataSheets/TestData.xlsx";
setExcel(path,"Sheet1");
String cellData =getCellData(1, 1);
System.out.println("Cell Data:"+cellData);
System.out.println("Total Number of rows:"+rowCount());
setCellValue(path, 3, 2,"Hello");

}
}