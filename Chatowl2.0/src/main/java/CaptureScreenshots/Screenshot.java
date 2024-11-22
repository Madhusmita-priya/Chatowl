package CaptureScreenshots;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.TakeScreenshot;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  
  driver.get("https://www.amazon.in/");
  driver.manage().window().maximize();
  
  //Full page screenshort
  
  TakesScreenshot  ts=((TakesScreenshot)driver);
  File sourcefiles=ts.getScreenshotAs(OutputType.FILE);
  File targetfile=new File("//Users/manoj/eclipse-workspace/Chatowl2.0/Screenshot\\fullpage.png");
  sourcefiles.renameTo(targetfile); 
  driver.quit();
	}

}
