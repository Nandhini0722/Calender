package org.calender;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws AWTException, InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@for='departure']")).click();
	        String end_date="27,March 2020";
		       String[] split=end_date.split(",");
		       String date=split[0];
		       int date1=Integer.parseInt(date);
		       String mon_yr=split[1];
		       String str=null;int counti=1,datecount=1;
		       
		      lable: do{
		      List<WebElement> eles=driver.findElements(By.xpath("//*[@class='DayPicker-Months']//div[@class='DayPicker-Month']/div[1]/div"));
	            for(WebElement ele:eles) {
	        	str=ele.getText();
	        	if(str.equalsIgnoreCase(mon_yr)) {
	        		List<WebElement> dates=driver.findElements(By.xpath("//*[@class='DayPicker-Months']/div["+counti+"]//div[@class='dateInnerCell']/p[1]"));
	        		for(WebElement finalDate:dates) {
	        			if(datecount==date1) {
	        				finalDate.click();
	        			}
	        			datecount++;
	        		}
	        		break lable;
	        	}
	        	else
	        	counti++;
	        }
	        counti=1;
	        		driver.findElement(By.xpath("//*[@class='DayPicker-wrapper']/div/span[2]")).click();
	        
		       }while(!str.equalsIgnoreCase(mon_yr));
	        
	        
	        

	       
	       
}
}
