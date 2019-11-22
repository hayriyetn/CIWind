package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	WebDriver driver;
	
  public ProductDetailPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
		this.driver=driver;
		}

@FindBy(css="#SearchResults > div.Section__container > div > div > div.FilteredCollection_container > div.FilteredCollection__flex-container > div.FilteredCollection__results-container > "
		+ "div.ResultsContainer.ResultsContainer--2-mobile-columns > div:nth-child(3) > a")
  public WebElement pictureInPDP;

//ul.ProductOption__variants.ProductOption__variants--list:nth-child(2) li[data-value='TAUPE'] --->This is not unique 


@FindBy(css="#SectionINF-ProductOverview > div > div.ProductOverview > div.ProductInfo.Animate.Animate--slide-left.Animate--animated > form > div.ProductOptions > div.ProductOption.ProductOption--half > ul >"
		+ " li.ProductOption__variant-custom.ProductOption__variant-custom--color.isp-product-color-swatch.isp-product-color-swatch-rust")
public WebElement rustColor;

	public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,1000)");
	}

	public void clickPicture() {
		
		pictureInPDP.click();
		
	}	
	
	public void changeColor() {
		
		rustColor.click();
	}

}
