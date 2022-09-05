import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ClassA {
static WebDriver driver;

@BeforeClass
	
public static void beforeClass() {
	WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.get("https://adactinhotelapp.com/");
}

@Test

public void login() {
	WebElement textUserName = driver.findElement(By.id("username"));
	textUserName.sendKeys("prakashsk");
	
	String name = textUserName.getAttribute("value");
	
	Assert.assertEquals("verify UserName", "prakashsk", name);
	
	
	
	WebElement textPassword = driver.findElement(By.id("password"));
 textPassword.sendKeys("ready123");

 //String pass = textPassword.getAttribute("value");
 
 //Assert.assertEquals("verify Password", "ready123", pass);
 
 
 
 
 WebElement btnlogin = driver.findElement(By.id("login"));
 btnlogin.click();
}

@After

public void afterMethod() {
	long time = System.currentTimeMillis();
	System.out.println(time);
}

@Before

public void beforeMethod() {
	long time = System.currentTimeMillis();
	System.out.println(time);
}

@AfterClass

public static void afterClass() {
	driver.quit();
}



}
	

