package TestCases;

import org.testng.annotations.Test;

import PageObjects.ProductPage;

public class TC_002_ProductFilterTest extends TestBase.BaseClass{
	
	@Test
	public void filterTest() throws InterruptedException
	{
		ProductPage pp=new ProductPage(driver);
		pp.hoverAndAdjustPriceSlider(40, -60);
		//pp.clickTable();
		pp.handleUnexpectedPopup();
	    pp.clickProduct();
	    
	}

}
