package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}

	@FindBy(css="popup-subcription-inputs-email-de8f81cc-cb13-40da-bdac-bcf0d3eae6c8")
	public WebElement popSubmit;

	@FindBy(css="women-39-s-clothing-amp-fashion-dresses-tops-jackets-shoes-amp-more")
	public WebElement popSubmitButton;

	//css="input[type=\"text\"]:nth-child(2)"
	@FindBy(id="ispbxii_0")
	public WebElement search;

	@FindBy(css="div[class='popup-content']  a[href='#']")
	public WebElement popupCloseSign;

	@FindBy(css="women-39-s-clothing-amp-fashion-dresses-tops-jackets-shoes-amp-more")
	public WebElement anyWhere;

	@FindBy(css="#SearchResults > div.Section__container > div > div > div.FilteredCollection_container >"
			+ " div.FilteredCollection__controls-container > div.FilteredCollection__controls-left > div.PaginationRange")
	public WebElement viewCaption;


	public void handlePop() {

		Actions randomclick = new Actions(driver);
		randomclick.moveByOffset(0, 0).click().perform();
		

	}

	public void search(String str) {
		search.sendKeys(str);
		search.sendKeys(Keys.ENTER);
		
	}

}
