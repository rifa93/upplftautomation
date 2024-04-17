package org.upplft;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CandidateHomepage extends BaseClass {
	@Test
	private void canHome() throws Throwable {
		// TODO Auto-generated method stub

	
	
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		candiLog();
		Thread.sleep(1000);
		screenShot("successmessage");
		// ULT_Tc_020:to check if the upplft logo is available
		WebElement logo = driver.findElement(By.xpath("//img[@class='rocketLogo']"));
		boolean displaylogo = logo.isDisplayed();
		if (displaylogo==true) {
			System.out.println("logo is available");
			
			
		}
		else {
			System.out.println("logo not displayed");
		}
		// ULT_Tc_021:to check if the home button is clickable
		String homeurl="https://www.upplftstaging.com/dashboards/candidate";
		
		WebElement homeButton = driver.findElement(By.className("ng-star-inserted"));
		homeButton.click();
		
		String curhomeurl = driver.getCurrentUrl();
		if (curhomeurl.equals(homeurl)) {
			System.out.println("home icon is working");
			
		}
		else {
			System.out.println("home icon not working");
		}
		// ULT_Tc_022: to check if matches menu is present
		
		WebElement matchesbtn = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		boolean matchesbutton = matchesbtn.isDisplayed();
		if(matchesbutton==true) {
			System.out.println("matches button is displayed");
		}
		else {
			System.out.println("matches button not available");
		}
		//  ULT_Tc_023:to check if matches menu is working
		String Actmatcheslink= "https://www.upplftstaging.com/dashboards/work";
		WebElement matchesbtn1 = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		matchesbtn1.click();
		String curmatcheslink = driver.getCurrentUrl();
		if (Actmatcheslink.equals(curmatcheslink)) {
			System.out.println("matches button working");
			
		}
		else {
			System.out.println("matches button not working");
		}
		// ULT_Tc_024: to check if the settings menu is present
		 WebElement settingsbtn = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[4]"));
          boolean settingsbtn1 = settingsbtn.isDisplayed();	
          if (settingsbtn1=true) {
			System.out.println("settings button is available");
		}
          else {
          System.out.println("settings button is not available");
          }
		 //  ULT_Tc_025:to check if the settings menu is working
          String actsettingslink="https://www.upplftstaging.com/dashboards/candidate-settings";
          
          WebElement settingsbtn2 = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[4]"));
		settingsbtn2.click();
		String currsettingslink = driver.getCurrentUrl();
		if (actsettingslink.equals(currsettingslink)) {
			System.out.println("settings menu is working");
			
		}
		else {
			System.out.println("settings menu not working");
		}
		impWait();
		// ULT_Tc_026:to check if the calendar menu is Working
		String Calender="https://www.upplftstaging.com/scheduler";
		WebElement calenderlink = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[3]"));
		calenderlink.click();
		String calcururl = driver.getCurrentUrl();
		
		if (Calender.equals(calcururl)) {
			System.out.println("Calender link is working");
		}
		else {
			System.out.println("calender link is not working");
		}
		
		impWait();
		// ULT_Tc_027:to check if the calendar menu is present
		boolean callink = calenderlink.isDisplayed();
				
				if (callink==true){
			System.out.println("Calender link is present");
		}
		else {
			System.out.println("calender link is not present");
		}
		
		
		
		
		
	
		
		impWait();
	driver.quit();
	
	
}
}
	
