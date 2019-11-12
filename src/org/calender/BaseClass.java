package org.calender;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	WebDriver driver;
	public void browserLaunch(String browser) {
		switch(browser.toUpperCase()){
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case "FF":
			System.setProperty("webdriver.chrome.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
       }
		driver.manage().window().maximize();
   }
	public void launchUrl(String url) {
		driver.get(url);

	}
	private void message() {
		System.out.println("added message");
		// TODO Auto-generated method stub

	}
	

}
