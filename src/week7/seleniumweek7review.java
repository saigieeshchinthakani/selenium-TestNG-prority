package week7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumweek7review {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Google...");
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		driver.close();

	}

}
