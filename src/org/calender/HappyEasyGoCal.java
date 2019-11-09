package org.calender;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyEasyGoCal {
   public static void main(String[] args) throws AWTException, InterruptedException {
	   int count=1;
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.happyeasygo.com/flight/?utm_source=google&utm_medium=cpc&utm_campaign=GG_PC_SE_IN_en_Flight_Generic_NA_Exact&gclid=EAIaIQobChMI1YL3_IO85QIVlRWPCh0uZgPdEAAYAiAAEgJenPD_BwE");
        driver.manage().window().maximize();
        WebElement from=driver.findElement(By.id("D_city"));
        from.click();
        from.sendKeys("chennai");
        Thread.sleep(3000);
        Robot robo=new Robot();
        robo.keyPress(KeyEvent.VK_ENTER); 
        robo.keyRelease(KeyEvent.VK_ENTER);
        WebElement to=driver.findElement(By.id("A_city"));
        //to.click();
        to.sendKeys("salem");
        Thread.sleep(3000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
		driver.findElement(By.id("D_date")).click();
        String date_mon_yr="14-November 2019";
        String[] split=date_mon_yr.split("-");
        String checkdate=split[0];
        int date=Integer.parseInt(checkdate);
        String check_mon_yr=split[1];
        List<WebElement> mon_yr=driver.findElements(By.xpath("//*[@class='ui-datepicker-title']"));
        for(int i=0;i<mon_yr.size();i++) {
        	String test=mon_yr.get(i).getText();
        	if(test.equalsIgnoreCase(check_mon_yr)) {
        		List<WebElement> dates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div["+(i+1)+"]//tbody//td/a"));
        		for(WebElement ele:dates) {
        			if(count==date) {
        				ele.click();
        			}
        			count++;
        		}
        	}
        }
   }
}
