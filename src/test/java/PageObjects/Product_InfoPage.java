package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Product_InfoPage extends BasePage {

	public Product_InfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		
		@FindBy(xpath=("//h1[contains(text(),'Pingle')]"))
		WebElement productName;
	
		@FindBy(xpath=("//button[@id='add-to-cart-button']"))
		WebElement btnAddtoCart;
		
		public void productNameCheck() {
			if(productName.isDisplayed())
			{
			Assert.assertTrue(true);
			}
		}
		
		public void clickAddtoCart()
		{
			btnAddtoCart.click();
		}
}
