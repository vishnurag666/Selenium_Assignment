package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass  {
 public static WebDriver driver;
 
 @BeforeSuite
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.urbanladder.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

 @AfterSuite
public void teardown()
{
	driver.quit();
}
}
