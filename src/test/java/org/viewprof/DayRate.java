package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class DayRate extends BaseClass{
	@Test
	private void dayRat() throws Throwable {
		// TODO Auto-generated method stub
		BaseClass obj =new BaseClass();
		launchBrowser(obj.browserkey);
		launchUrl();
		candiLog();
		viewProf();
		impWait();
		// Find the element to scroll to (you can modify this selector as per your requirement)
	    WebElement element = driver.findElement(By.xpath("//mat-select[@name='location']"));
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	    // Scroll to the element using JavaScript Executor
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		

		WebElement locdrop = driver.findElement(By.xpath("(//mat-select[@name='dayRate'])[1]"));
		
		Thread.sleep(1000);
		locdrop.click();
		
	    List<WebElement> dayDrop = driver.findElements(By.className("mat-option-text"));
	    for (WebElement dayDrop1 : dayDrop) {
	    	String droplist = dayDrop1.getText();
	    	System.out.println("the available options are :"+droplist);
			
		}
		
	    for (WebElement dayDrop1 : dayDrop) {
	    	dayDrop1.click();
	    	impWait();
	    	String droplist = dayDrop1.getText();
	    	System.out.println("the selected options are :"+droplist);
	    	locdrop.click();
	    }
	
	simpleClick();
	profSave();
	driver.quit();
	
	}

}
