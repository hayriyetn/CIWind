package tests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.BaseWi;

public class HomePageTest extends BaseWi {
	WebDriver driver;
	HomePage homePage;
    String item="jacket";
    String capture="Viewing 1-48 of 265 items";
    String email="random@gmail.com";
	

	@BeforeMethod
    
	public void getDriver() throws Exception {
		
	   this.driver = goHome();
		
		homePage=new HomePage(driver);
		
		Thread.sleep(2000);
		
		homePage.handlePop();
		
		homePage.search(item);
	}



@Test
public void checkViewCaption() {
	
	String actual=homePage.viewCaption.getText();
	
	Assert.assertEquals(actual, capture);
	
	
}
}
