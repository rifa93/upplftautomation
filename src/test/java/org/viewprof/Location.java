package org.viewprof;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class Location extends BaseClass{
	@Test
	private void locDrop() throws InterruptedException {
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
		
		

		WebElement locdrop = driver.findElement(By.xpath("//mat-select[@name='location']"));
		
		Thread.sleep(1000);
		locdrop.click();
		List<WebElement> LocList = driver.findElements(By.className("mat-option-text"));
	     for (WebElement list1 : LocList) {
	    	 System.out.println("the locations dropdown list is : "+list1.getText());
			
		}
	     for (WebElement list1 : LocList) {
	    	 list1.click();
	    	 impWait();
	    	 String locdroplist = list1.getText();
	    	 System.out.println("the selected option is:" +locdroplist);
	    	 locdrop.click();
	   
	    	 
	
		}
	     simpleClick();
	     profSave();
	     driver.quit();
	}

}
