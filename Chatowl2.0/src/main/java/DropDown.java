import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	WebDriver driver;
	
	public void Method1()
	{
	driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     WebElement e1=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
     e1.sendKeys(Keys.ARROW_DOWN);
     e1.sendKeys(Keys.ARROW_DOWN);
     e1.sendKeys(Keys.ARROW_DOWN);
}
}
