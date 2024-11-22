package Chatowl;

import org.openqa.selenium.chrome.ChromeDriver;


public class acti_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //System.setProperty("Webdriver.chrome.driver, null);
		
		ChromeDriver ref=new ChromeDriver();
		ref.get("https://www.google.com/");
		System.out.print(ref.getCurrentUrl());
	
	}
	
}
