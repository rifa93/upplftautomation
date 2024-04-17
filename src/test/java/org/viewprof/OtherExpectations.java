package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class OtherExpectations extends BaseClass{
   
	@Test
	private void otherExp() throws Throwable {
		// TODO Auto-generated method stub
		BaseClass obj =new BaseClass();
		launchBrowser(obj.browserkey);
	    launchUrl();
	    candiLog();
	    viewProf();
	    Thread.sleep(2000);
	    
	 // Find the element to scroll to (you can modify this selector as per your requirement)
	    WebElement element = driver.findElement(By.xpath("//mat-select[@name='location']"));
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	    // Scroll to the element using JavaScript Executor
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
		

	    
	    WebElement otherexp = driver.findElement(By.xpath("//mat-select[@name='otherExpectations']"));
	    
	     Thread.sleep(1000);
	     otherexp.click(); 
	    
	    List<WebElement> drop = driver.findElements(By.className("mat-option-text"));
	    for (WebElement drop1 : drop) {
	    	String droplist = drop1.getText();
	    	System.out.println("the available options are :"+droplist);
			
		}
	    for (WebElement drop1 : drop) {
	    	drop1.click();
	    	impWait();
	    	String droplist = drop1.getText();
	    	System.out.println("the selected options are :"+droplist);
	    	
			
		}
      simpleClick();
      profSave();
      driver.quit();
	}
}
