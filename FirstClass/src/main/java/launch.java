import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {

	public static void main(String[] args) {
		
	//	WebDriver Manager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.get(https://www.facebook.com/"");
		driver.manage().window().maximize();
		
	}

	
}
