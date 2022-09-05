package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static final int cellnum = 0;
public static WebDriver driver;
public Date dateCellValue;

public  static void getDriver() {
	WebDriverManager.chromedriver().setup();
	
}
public  static void enterurl(String url) {
	driver= new ChromeDriver(); 
	driver.get(url);
}

public static void navigateURL(String url) {
	// TODO Auto-generated method stub
driver.navigate().to(url);
}


public static void MaximizeWindow() {
	driver.manage().window().maximize();
}

public static void quitWindow() {
	driver.quit();
}

public static void elementSendkeys(WebElement element, String data) {
	element.sendKeys(data);
}

public static void elementClick(WebElement element) {
	element.click();
}


public static String StringgetTitle() {
	String title = driver.getTitle();
	return title;
}
public static WebElement elementFindById(String attributevalue) {
	
	WebElement element = driver.findElement(By.id(attributevalue));
	return element;
}

public static WebElement elementfindByClassName(String attributeValue) {
	WebElement element = driver.findElement(By.className(attributeValue));

return element;
}

public static String elementGetAttributeValue(WebElement element) {
	String attribute = element.getAttribute("Value");
	return attribute;
}

public static String elementGetAttributeValue(WebElement element, String attributeName) {
	 String attribute = element.getAttribute(attributeName);
	return attribute;
}

public static void selectOptionByText(WebElement element, String text) {
	Select select = new Select(element);
	select.selectByVisibleText(text);
	
}

public static void selectOptionByIndex(WebElement element, int index) {
	Select select = new Select(element);
	select.selectByIndex(index);
}
public static void selectOptionByValue(WebElement element, String text) {
	Select select = new Select(element);
	select.selectByValue(text);
}


public static void writeExcelCellValue(String SheetName, int rownum, int cellnum, String data) throws IOException {
	
	
	File file = new File("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\hello.xlsx");
	
	FileInputStream fileInputStream = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
	
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rownum);
			Cell createcell = row.createCell(cellnum);
	createcell.setCellValue(data);
	FileOutputStream fileOutputStream = new FileOutputStream(file);
	workbook.write(fileOutputStream);


}
public static String getExcelCellValue(String SheetName, int rownum, int cellnum) throws IOException {
	String res = null;

	File file = new File
			("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\hello.xlsx");
	
	FileInputStream fileInputStream = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
	
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	
	CellType type = cell.getCellType();
	
	switch(type){
	case STRING:
		 res = cell.getStringCellValue();
		
		break;
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue2 = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			res = dateFormat.format(dateCellValue2);
		}
		else
		{
			double numericCellValue = cell.getNumericCellValue();
			long check = Math.round(numericCellValue);
			if(check==numericCellValue) {
				res = String.valueOf(check);
			}
			else {
				res = String.valueOf(numericCellValue);
			}
		}
		break;
		default:
			break;
	}
			
		
	return res;
}	




public static int getExcelRowSize(String sheetName) throws IOException {
File file = new File("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\hello.xlsx");
	
	FileInputStream fileInputStream = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
	
	Sheet sheet = workbook.getSheet(sheetName);
	
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

	return physicalNumberOfRows;

}









}

