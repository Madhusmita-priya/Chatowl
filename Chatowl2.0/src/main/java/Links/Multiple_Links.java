package Links;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Links {

	public static void main(String[] args) 
	{
		 // Set up the WebDriver
     /*   WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

       // Find all <option> tags on the page (if you're working with dropdowns)
        List<WebElement> allTags = driver.findElements(By.tagName("option"));

        // Print the total number of <option> tags
        System.out.println("Total option tags are: " + allTags.size());

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Iterate over all <option> tags and print their 'value' attribute
        for (int i = 0; i < allTags.size(); i++) {
            WebElement optionTag = allTags.get(i);
            String value = optionTag.getAttribute("value");  // Get the 'value' attribute of each <option>
            System.out.println("Option " + (i + 1) + " value: " + value);
        }

        // Quit the driver
        driver.quit();  */
    }  
}