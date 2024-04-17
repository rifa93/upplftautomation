package org.upplft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class CalenderPage extends BaseClass {
	@Test
private void calPage() throws Throwable {
	// TODO Auto-generated method stub



		launchBrowser(browserkey);
		launchUrl();
		impWait();
		WebElement click = driver.findElement(By.xpath("(//a/span[contains(@class, 'candidate')])[1]"));
       
		
		clickButton(click);
		LoginPage pomLoginPage=new LoginPage();
		//ULT_Tc_019:to Check if the log in info appears at top right after successful login
		enterValue(pomLoginPage.getUser(), "rifa@agileitexperts.com");
		enterValue(pomLoginPage.getPass(), "Admin@123");
		
		
		clickButton(pomLoginPage.loginBtn());
		
		WebElement calenderlink = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[3]"));
		calenderlink.click();
		
//to check if the calender view button is working
	    
	    WebElement cal = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[3]"));
	    cal.click();
	    boolean caldis = cal.isDisplayed();
	    if(caldis==true) {System.out.println("Calender button is displayed");
	}
	
    else {
    	System.out.println("Calender button not displayed");
    }
	    String actCalLink="https://www.upplftstaging.com/scheduler";
	    cal.click();
	    String curcallink = driver.getCurrentUrl();
	    
if (actCalLink.equals(curcallink)) {
	System.out.println("Calender link is working");
	
}
else {
	System.out.println("calender link is not working");
}
		//to check if the list view button is working

WebElement Listview = driver.findElement(By.xpath("(//mat-button-toggle[@role='presentation'])[2]"));
Listview.click();
List<WebElement> tableheader = driver.findElements(By.tagName("th"));
for (WebElement allhead : tableheader) {
	System.out.println("the table headers are : "+allhead.getText());
	
}

		//to check if the past events button is working
WebElement pastEvent = driver.findElement(By.xpath("(//mat-button-toggle[@role='presentation'])[3]"));
pastEvent.click();
boolean eventClick = pastEvent.isSelected();
if (eventClick==true) {
	System.out.println("past event is clicked");
	
} else {
	System.out.println("past event is not clicked");

}
List<WebElement> eventlist = driver.findElements(By.tagName("th"));
for (WebElement allEvent : eventlist) {
	System.out.println("the event list table headers are : "+allEvent.getText());
	
}
impWait();

		//to check if the  next  button is working



WebElement calview = driver.findElement(By.xpath("(//mat-button-toggle[@role='presentation'])[1]"));
calview.click();
WebElement nextmon = driver.findElement(By.xpath("//button[@title='Next Month']"));
nextmon.click();
WebElement nextmonth = driver.findElement(By.className("fc-toolbar-title"));
String nextmonthtit = nextmonth.getText();
System.out.println("the next month is : "+nextmonthtit );
driver.navigate().refresh();
		//to check if the  previous button is working
WebElement prevmon = driver.findElement(By.xpath("//button[@title='Previous Month']"));
prevmon.click();
WebElement prevmontit = driver.findElement(By.className("fc-toolbar-title"));
String prevtit = prevmontit.getText();
System.out.println("the previous month Title is: "+prevtit);

		//to check if the  today button is working
WebElement ThisMon = driver.findElement(By.xpath("//button[@title='This Month']"));
ThisMon.click();
Thread.sleep(2000);
WebElement thismontit = driver.findElement(By.className("fc-toolbar-title"));
System.out.println(" current month is : "+thismontit.getText());

//to check if the  month  button is working
WebElement mon = driver.findElement(By.xpath("//button[@title='Month view']"));
mon.click();

String btnatt1 = mon.getAttribute("class");
if (btnatt1.contains("fc-dayGridMonth-button fc-button fc-button-primary fc-button-active")) {
	System.out.println("month button is highlighted");
} else {
System.out.println("month button not highlighted");
}
WebElement week = driver.findElement(By.xpath("//button[@title='Week view']"));
week.click();
//to check if the  week button is working
String btnatt2 = week.getAttribute("class");
if (btnatt2.contains("fc-dayGridWeek-button fc-button fc-button-primary")) {
	System.out.println("week button is highlighted");
} else {
System.out.println("Week button not highlighted");
}
//to check if the  day button is working
WebElement day = driver.findElement(By.xpath("//button[@title='Day view']"));
day.click();
String btnatt3 = day.getAttribute("class");
if (btnatt3.contains("fc-dayGridDay-button fc-button fc-button-primary")) {
	System.out.println("Day button is highlighted");
} else {
System.out.println("Day button not highlighted");
}



		
		
driver.quit();	
		
		
	}
	
	

}
