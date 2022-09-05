import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Replace {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\example.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("data");
		
		Row row = sheet.getRow(8);
		
		Cell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		if(value.equals("omr")) {
		 cell.setCellValue("ECR");
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		workbook.write(outputStream);
		
		}
		
		
		
	}


