package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=("//div[normalize-space()='Price']"))
	WebElement drpdwnPrice;
	
	public void clickPrice()
	{
		drpdwnPrice.click();
	}
	
	
	@FindBy(xpath=("//div[@class='noUi-handle noUi-handle-lower']"))
	WebElement minSlider;
	
	
	@FindBy(xpath=("//div[@class='noUi-handle noUi-handle-upper']"))
	WebElement maxSlider;
	
	@FindBy(xpath=("//input[@id='price_limit_439-51039']"))
	WebElement btnfilter;
	
public void hoverAndAdjustPriceSlider(int min, int max) throws InterruptedException
{
	Actions action=new Actions(driver);
	
	
	//using Action class to hover over the price filter
	action.moveToElement(drpdwnPrice).perform();
	
	//Controlling the Sliders
//	
//	action.dragAndDropBy(drpdwnPrice, min, max).perform();
	
	  action.dragAndDropBy(minSlider, min, 0).perform();
      action.dragAndDropBy(maxSlider, max, 0).perform();
      
      action.click(btnfilter).perform();
      Thread.sleep(3000);
      
	
}

	@FindBy(xpath=("//img[@title='Table Furniture Tray Solid Wood Bedside Table in Walnut Finish']"))
	WebElement imgTable;
	
	public void clickTable() {
		imgTable.click();
	}
  @FindBy(xpath=("//a[normalize-space()='Close']"))
  WebElement btnClossPopup;
  
  @FindBy(xpath=("//div[@class='login-message']"))
  WebElement popupmsg;
  
  
  @FindBy(xpath=("//a[normalize-space()='Sign-up']"))
  WebElement lnksignup;
  
  public void handleUnexpectedPopup()
  {
	  try {
		if(popupmsg.isDisplayed()) {
//			System.out.println("popup is here");
//			driver.switchTo().frame(lnksignup);
//		     lnksignup.click();
			Thread.sleep(2000);
			Actions action= new Actions(driver);
			action.click(btnClossPopup).perform();
		}
	 
	} catch (Exception e) { 
		// TODO: handle exception
		System.out.println("pop up not visible");
	}
  }
  
  @FindBy(xpath=("//li[1]//div[1]//div[3]//div[2]//a[2]"))
  WebElement btnViewProduct;
  
  public void clickProduct()
  {
	  btnViewProduct.click();
  }
  
}
