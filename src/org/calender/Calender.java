package org.calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calender {
	public static void main(String[] args) {
		WebDriver driver=null;
		BaseClass obj=new BaseClass();
		obj.browserLaunch("chrome");
		obj.launchUrl("https://www.happyeasygo.com/flight/?utm_source=google&utm_medium=cpc&utm_campaign=GG_PC_SE_IN_en_Flight_Generic_NA_Exact&gclid=EAIaIQobChMI-9HWsO-05QIVzRErCh2UdQCCEAAYASAAEgIB1fD_BwE");
	
	driver.findElement(By.id("D_date")).click();
	
	
	}
	
	
	

}
