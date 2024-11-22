package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	
	public void Method1()
	{
	driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("nav-search-scope nav-sprite"));
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ARROW_DOWN);
	
	}

}

