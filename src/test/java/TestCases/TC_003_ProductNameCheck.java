package TestCases;

import org.testng.annotations.Test;

import PageObjects.ProductPage;
import PageObjects.Product_InfoPage;

public class TC_003_ProductNameCheck extends TestBase.BaseClass {
	@Test
	public void productNameCheck() throws InterruptedException {
		
//		Home_Page hp=new Home_Page(driver);
//		Thread.sleep(2000);
//		hp.sendSearch("Table");
//		hp.clickSearch();
//		
	ProductPage pp =new ProductPage(driver);
		pp.clickProduct();
		pp.handleUnexpectedPopup();
		
		Product_InfoPage pi= new Product_InfoPage(driver);
		pi.productNameCheck();
		
	}
  
}
