package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class IntrestedIn extends BaseClass{
	@Test
   private void intIn() throws Throwable {
		
	
		BaseClass obj =new BaseClass();
		launchBrowser(obj.browserkey);
		launchUrl();
		  candiLog();
		 
		 viewProf();
		// Find the element to scroll to (you can modify this selector as per your requirement)
		    WebElement element = driver.findElement(By.xpath("//mat-select[@name='job']"));
		     JavascriptExecutor js=(JavascriptExecutor)driver;
		    // Scroll to the element using JavaScript Executor
		    js.executeScript("arguments[0].scrollIntoView(true);", element);
			impWait();
		 
		 WebElement intDrop = driver.findElement(By.xpath("//mat-select[@name='job']"));
	
		 Thread.sleep(3000);
		 intDrop.click();

		  List<WebElement> intDrop1 = driver.findElements(By.className("mat-option-text"));
		  for (WebElement Droplist : intDrop1) {
			  String droptext = Droplist.getText();
			  System.out.println("the available intrested in options are :"+droptext);
		
		}
		   
		  for (WebElement Droplist : intDrop1) {
			  String droptext = Droplist.getText();
			  Droplist.click();
			  impWait();
			  System.out.println("the selected intrested in options are :"+droptext);
			  
			  
		  }
		  
		  simpleClick();
		  profSave();
		  driver.quit();
	}
	
}
