import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.hc.core5.net.WWWFormCodec;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	//1.0	
		File file = new File("C:\\Users\\s.k.prakash\\eclipse-workspace\\FirstClass\\Excel sheet\\example.xlsx");
	//2.0
		FileInputStream stream = new FileInputStream(file);
	//3.
	XSSFWorkbook workbook = new XSSFWorkbook(stream);
	//4.0
	Sheet sheet = workbook.getSheet("data");
	
	//5.1
    for(int i=0; i< sheet.getPhysicalNumberOfRows();i++) {
    	
    	//5.1.1
    	Row row = sheet.getRow(i);
    	
    	//5.1.2
    	
    	for(int j=0; j< row.getPhysicalNumberOfCells(); j++) {
    		
    		Cell cell = row.getCell(j);
    		
    		CellType type = cell.getCellType();
    		
    		switch (type) {
    		
    		case STRING:
    		 String txt = cell.getStringCellValue();
    		 System.out.println(txt);
    		 break;
    		case NUMERIC:
    			if(DateUtil.isCellDateFormatted(cell)) {
    				Date dateCellValue = cell.getDateCellValue();
    				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yy");
    			String format = simpleDateFormat.format(dateCellValue);
    			System.out.println(format);
    			}
    			else
    			{
    				double d = cell.getNumericCellValue();
    				BigDecimal b = BigDecimal.valueOf(d);
    				String num = b.toString();
    				System.out.println(num);
    			}
    			break;
    			default:
    				break;
    				
    				
    				
    				
    			}
    			
    			
    			
    			
    			
    			
    			
    			
    			//double d = cell.getNumericCellValue();
    			
    			//BigDecimal b = BigDecimal.valueOf(d);
    			
    			//String num = b.toString();
    			//System.out.println(num);
    			//break;
    			//default:
    			//break;
    		}
    		
    		
    	}
    	
    	
    	
    	
    	
    }
	
	
	
	
	
	}
	
	
	
