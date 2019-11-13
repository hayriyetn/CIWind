package utilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWi {
	public WebDriver driver;

	   @BeforeClass
		public void setUp() {
		   
		   WebDriverManager.chromedriver().setup();
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\tanha\\OneDrive\\Documents\\selenium dependencies\\drivers\\chromedriver77.exe");
		   driver=new ChromeDriver();
		   
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3 ,TimeUnit.SECONDS);
	     }
		

		
		public WebDriver goHome() {
			driver.get("https://www.windsorstore.com");
		    return this.driver;
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}

	}