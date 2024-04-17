package org.viewprof;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class EnglishProf extends BaseClass{
	@Test
   private void profEng() throws InterruptedException, AWTException {
		BaseClass obj =new BaseClass();
	launchBrowser(obj.browserkey);
	launchUrl();
	candiLog();
	viewProf();
	impWait();
	simpleClick();
	// Find the element to scroll to (you can modify this selector as per your requirement)
    WebElement element = driver.findElement(By.xpath("//mat-select[@name='englishProficiency']"));
     JavascriptExecutor js=(JavascriptExecutor)driver;
    // Scroll to the element using JavaScript Executor
    js.executeScript("arguments[0].scrollIntoView(true);", element);
	
     
	impWait();
	WebElement profDrop = driver.findElement(By.xpath("//mat-select[@name='englishProficiency']"));
	profDrop.click();
	impWait();
	
	
     List<WebElement> droplist = driver.findElements(By.className("mat-option-text"));
     for (WebElement drop1 : droplist) {
    	 String droptext = drop1.getText();
    	 System.out.println("The available options are: "+droptext);
		
	}
     for (WebElement drop1 : droplist) {
    	 
    	 String droptext = drop1.getText();
    	 drop1.click();
    	 impWait();
    	 System.out.println("The selected options are: "+droptext);
    	 
    	 profDrop.click();
    	
		
	}
        simpleClick();
		profSave();
		driver.quit();
			
	
	
}

}
