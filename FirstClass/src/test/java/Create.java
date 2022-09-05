import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\hello.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("test");
		
		Row row = sheet.createRow(5);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("api");
		
		FileOutputStream stream = new FileOutputStream(file);
		
		workbook.write(stream);
		
		
		
		
	}
}

