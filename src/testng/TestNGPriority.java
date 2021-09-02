package testng;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
			
import org.testng.Assert;			
import org.testng.annotations.Test;			

public class TestNGPriority {
	WebDriver driver;
	
	@Test (priority=1)
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Hello Selenium...");
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		//driver.close();
 

	}					

    // Method 2: Launch Google.com			
    @Test (priority=2)		
    public void launchGoogle() {				
    	
		driver.get("http://www.google.co.in");	
		//driver.close();
    }		

    // Method 3: Perform a search using "Facebook"			
    @Test (priority=3)		
    public void peformSeachAndClick1stLink() {	
    	
    	driver.get("http://www.google.co.in");	
        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");	
        driver.get("http://Facebook.com");
       // driver.close();
    }		

   	
}
