import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class AdactinHotelBooking extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// WebriverManager.Chromedriver().Setup();
		//WebDriver driver = new ChromeDriver();
		
		
		
		getDriver();
		
		enterurl("https://www.google.co.in/");
		MaximizeWindow();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int excelRowSize = getExcelRowSize("test");
		
		
		//driver.get("http://adactinhotelapp.com/");
		
		System.out.println("Tot No of Customer : "+ (excelRowSize -1));
		
		
		for(int i=1;i<excelRowSize;i++) {
			long startTime = System.currentTimeMillis();
			
		navigateURL("http://adactinhotelapp.com/");

		WebElement textUserName = elementFindById("username");
		
		// textUserName.SendKeys("prakashsk");
		
		String name = getExcelCellValue("test", i, 0);
		elementSendkeys(textUserName, name);
		
		WebElement txtPassword = elementFindById("password");		
		String pass = getExcelCellValue("test", i, 1);
		elementSendkeys(txtPassword, pass);
		
		WebElement btnLogin = elementFindById("login");
		btnLogin.click();
				
		WebElement location = elementFindById("location");		
		String loc = getExcelCellValue("test", i, 2);
		elementSendkeys(location, loc);
		
		WebElement hotels = elementFindById("hotels");		
		String hotel = getExcelCellValue("test", i, 3);
		elementSendkeys(hotels, hotel);
	
		WebElement roomtype = elementFindById("room_type");		
		String room = getExcelCellValue("test", i, 4);
		elementSendkeys(roomtype, room);
	
		WebElement numofroom = elementFindById("room_nos");		
		String noroom = getExcelCellValue("test", i, 5);
		elementSendkeys(numofroom, noroom);
		
		WebElement checkindate = elementFindById("datepick_in");		
		String in = getExcelCellValue("test", i, 6);
		elementSendkeys(checkindate, in);
		
		WebElement checkoutdate = elementFindById("datepick_out");		
		String out = getExcelCellValue("test", i, 7);
		elementSendkeys(checkoutdate, out);
		
		WebElement adultinroom = elementFindById("adult_room");		
		String adult = getExcelCellValue("test", i, 8);
		elementSendkeys(adultinroom, adult);
		
		WebElement childperroom = elementFindById("child_room");		
		String child = getExcelCellValue("test", i, 9);
		elementSendkeys(childperroom, child);
		
		WebElement btnsearch = elementFindById("Submit");
		btnsearch.click();
		
		WebElement btnokay = elementFindById("radiobutton_0");
		btnokay.click();
		
		WebElement btnnext = elementFindById("continue");
		btnnext.click();
		
		WebElement firstname = elementFindById("first_name");		
		String name1 = getExcelCellValue("test", i, 10);
		elementSendkeys(firstname, name1);
		
		WebElement lastname = elementFindById("last_name");		
		String name2 = getExcelCellValue("test", i, 11);
		elementSendkeys(lastname, name2);
		
		WebElement address = elementFindById("address");		
		String address1 = getExcelCellValue("test", i, 12);
		elementSendkeys(address, address1);
		
		WebElement ccnum = elementFindById("cc_num");		
		String ccnum1 = getExcelCellValue("test", i, 13);
		elementSendkeys(ccnum, ccnum1);
		
		WebElement cctype = elementFindById("cc_type");		
		String cctype1 = getExcelCellValue("test", i, 14);
		elementSendkeys(cctype, cctype1);
		
		WebElement ccmonth = elementFindById("cc_exp_month");		
		String ccmonth1 = getExcelCellValue("test", i, 15);
		elementSendkeys(ccmonth, ccmonth1);
		
		
		WebElement ccyear = elementFindById("cc_exp_year");		
		String ccyear1 = getExcelCellValue("test", i, 16);
		elementSendkeys(ccyear, ccyear1);

		
		WebElement cccvv = elementFindById("cc_cvv");		
		String cccvv1 = getExcelCellValue("test", i, 17);
		elementSendkeys(cccvv, cccvv1);
		
		WebElement btnbook = elementFindById("book_now");
		btnbook.click();
		
		
		WebElement ordernum = elementFindById("order_no");		
		
		String attribute = ordernum.getAttribute("value");
		
		
		System.out.println("Your order Id"+attribute);
		
		writeExcelCellValue("test",i,18,attribute);
		
		long endTime = System.currentTimeMillis();
		long diff = Math.subtractExact(endTime, startTime);
		System.out.println("Time in Ms"+diff);
		
		}
		
		
		driver.quit();
		
	
	}
			
	}
