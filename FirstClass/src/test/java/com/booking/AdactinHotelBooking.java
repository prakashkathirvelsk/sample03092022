package com.booking;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.base.BaseClass;

public class AdactinHotelBooking extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		enterurl("https://adactinhotelapp.com/");
		MaximizeWindow();
	}

	@Test
	public  void booking() throws IOException {
		//1.0 login
		LoginPage login = new LoginPage();
		System.out.println(getExcelCellValue("test", 1, 0)+" print excelsheet data");
		System.out.println(getExcelCellValue("test", 1, 1));
		login.input(getExcelCellValue("test", 1, 0), getExcelCellValue("test", 1, 1));
	}

	@AfterClass
	public static void afterClass() throws InterruptedException {
		Thread.sleep(6000);
		quitWindow();
	}
}

