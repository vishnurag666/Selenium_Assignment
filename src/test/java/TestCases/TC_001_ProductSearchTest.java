package TestCases;

import org.testng.annotations.Test;

import PageObjects.Home_Page;

public class TC_001_ProductSearchTest extends TestBase.BaseClass{
	
@Test
public void searchTest()
{
	Home_Page hp=new Home_Page(driver);
	hp.sendSearch("Table");
	hp.clickSearch();
	
	
}
}
