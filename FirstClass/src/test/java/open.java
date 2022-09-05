import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class open{

	public static void main (String[] args) throws IOException {
		
		String filelocation = "C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\example.xlsx";
		@SuppressWarnings("resource")
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		
		XSSFSheet sheet = wbook.getSheetAt(0);
						
		XSSFRow row = sheet.getRow(1);
		
			XSSFCell cell = row.getCell(0);
		
		
			@SuppressWarnings("unused")
			XSSFCell cell2 = row.getCell(2);
		 String value = cell.getStringCellValue();
		System.out.println(value);
		
		
	}
	}

	


