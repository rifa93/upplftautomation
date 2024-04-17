package org.upplft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class SearchandNotificatons extends BaseClass{
	@Test
	private void searchNot() throws Throwable {
		// TODO Auto-generated method stub

	
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		candiLog();
	
	// ULT_Tc_029:to check if the search bar is working
	
	WebElement search1 = driver.findElement(By.xpath("//input[@type='text']"));
	search1.sendKeys("test 123");
	impWait();



WebElement searchres = driver.findElement(By.xpath("//label[contains(text(),'test 123')]"));
String searchtext = searchres.getText();	
System.out.println(searchtext);
boolean searcres1 = searchres.isDisplayed();
if (searcres1==true) {
System.out.println("search result is displayed");

}
else {
System.out.println("search result not relevent");
}
// ULT_Tc_030:to check if the notification button is present

WebElement noti = driver.findElement(By.xpath("//button[@mattooltip='Notifications']"));
boolean noti1 = noti.isDisplayed();
if (noti1==true) {
System.out.println("notification button is available");

}
else {
System.out.println("notification button is not available");
}
// ULT_Tc_031:to check if the notification button is working
WebElement noti2 = driver.findElement(By.xpath("//button[@mattooltip='Notifications']"));
noti2.click();

WebElement notipop = driver.findElement(By.className("modal-header"));
impWait();
boolean popdisp = notipop.isDisplayed();
Thread.sleep(2000);
if (popdisp==true) {
System.out.println("notification popup is displayed");

}
else {
System.out.println("notification pop up is not displayed");
}
WebElement notipop1 = driver.findElement(By.xpath("//h6[contains(text(),'Notifications')]"));

String notipop2 = notipop1.getText();

boolean notval = notipop2.endsWith("s");
if (notval==true) {
System.out.println("the title is correct");

}
else {
System.out.println("the title is incorrect");
}



WebElement noticlose = driver.findElement(By.xpath("//button[@aria-label='Close']"));
noticlose.click();


driver.quit();

}
}