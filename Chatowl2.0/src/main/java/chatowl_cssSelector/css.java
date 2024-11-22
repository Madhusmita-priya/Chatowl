package chatowl_cssSelector;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class css {

	public static void main(String args[])
	{
		 WebDriver driver = new ChromeDriver();  
		 driver.get("https://chatowl.com/about-us/");
		 
		 driver.manage().window().maximize();
		 
		
	}
}
