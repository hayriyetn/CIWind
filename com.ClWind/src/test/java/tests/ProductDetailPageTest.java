package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailPage;
import utilities.BaseWi;


public class ProductDetailPageTest extends BaseWi{
	WebDriver driver;
	ProductDetailPage productDetailPage;
	HomePage homePage;
	String item2="jacket";
	String title="Corduroy Faux Fur Trucker Jacket";

	 
	@BeforeClass
	
	public void getIt() {
		
		this.driver=goHome();
		
		
		productDetailPage=new ProductDetailPage(driver);
		
		homePage=new HomePage(driver);
		homePage.search(item2);
// 		productDetailPage.scrollDown();
//		productDetailPage.clickPicture();
//		productDetailPage.changeColor();
	   
	}
	
	@Test 
	public void goToPDP() {

		Assert.assertTrue(driver.getTitle().contains(title));	
		
	}
	
	@Test @Ignore
	public void colorChange() {
		
		Assert.assertTrue(productDetailPage.TaupeColor.isDisplayed());
		
		
	}
}
