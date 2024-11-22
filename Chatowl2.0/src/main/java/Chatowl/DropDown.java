package Chatowl;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
{
public static void main(String args[]) throws InterruptedException
{
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
/*WebElement dr=driver.findElement(By.name("nav-search-scope nav-sprite"));
Select dr1=new Select(dr1);
List<WebElement>alloptions=dr1.getOptions();
for(WebElement option:alloptions)
{
	if(option.getText().equals(""))
	{
		option.click();
		break;  */
WebElement e1=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);
/*Select dropdown=new Select(e1);
dropdown.selectByIndex(2); */
driver.quit();




	}
}


