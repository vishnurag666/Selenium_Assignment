package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage {

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=("//input[@id='search']"))
	WebElement txtSearch;
	
	public void sendSearch(String search)
	{
		txtSearch.sendKeys(search);
	}
	
	@FindBy(xpath=("//span[@class='search-icon icofont-search']"))
	WebElement btnSearch;
	
	public void clickSearch()
	{
		btnSearch.click();
	}

}
