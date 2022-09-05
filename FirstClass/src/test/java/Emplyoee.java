import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Emplyoee {

	public void main(String[] args) throws IOException {  
		
		//1.mention the path of excel
		
	File file = new File("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\example.xlsx");		
	
	//2. read the objects/bytes from file
	
	FileInputStream stream = new FileInputStream(file);
	
	//3. create the work book--> colletion sheet
	
	@SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook(stream);
	
	//4.get the sheet
	
	Sheet sheet = workbook.getSheet("example");
	
	// 5.get the row
	
	Row row = sheet.getRow(1);
	
	//6.get the cell
		Cell cell = row.getCell(1);
	
	System.out.println(cell);
	
	}
	
}
