package org.viewprof;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class IndiIden extends BaseClass{
	
	@Test
	private void indiId() throws Throwable {
		// TODO Auto-generated method stub
    
	launchBrowser(browserkey);
	launchUrl();
	candiLog();
	viewProf();
	WebElement scroll = driver.findElement(By.xpath("//mat-select[@name='residencyStatus']"));
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	Thread.sleep(2000);
	
	WebElement check = driver.findElement(By.id("mat-checkbox-6"));

	check.click();
	impWait();
	
	
	
	boolean selected = check.isSelected();
	if(selected==true) {
		System.out.println("selected: test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}
	
	
	
	check.click();
	impWait();
	
	boolean notselected = check.isSelected();
	if(notselected==false) {
		System.out.println("deselected:test case passed ");
	}
	else {
		System.out.println("testcase failed");
	}
	profSave();
	driver.quit();

}
}