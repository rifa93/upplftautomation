package org.viewprof;

import java.awt.Robot;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.upplft.BaseClass;
import org.upplft.VeiwProfile;


public class TeamCulture extends BaseClass {
	@Test
	private void teamCul() throws Throwable {
		launchBrowser(browserkey);
		launchUrl();
		candiLog();
		viewProf();
		
		// Find the element to scroll to (you can modify this selector as per your requirement)
	    WebElement element = driver.findElement(By.xpath("//mat-select[@name='location']"));
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	    // Scroll to the element using JavaScript Executor
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    Thread.sleep(2000);
		WebElement retakeBtn = driver.findElement(By.xpath("(//span[contains(text(),'Re-take')])[2]"));
		retakeBtn.click();
		Thread.sleep(2000);
		
		 		
		List<WebElement> cultCont = driver.findElements(By.id("cultureConatiner"));
		for (WebElement conlis : cultCont) {
			String text = conlis.getText();
			System.out.println(text);
			
			
				}
		
		WebElement source1 = driver.findElement(By.xpath("//div[contains(text(),'Consistent')]"));
		
		WebElement des1 = driver.findElement(By.xpath("//div[contains(text(),'1')]"));
		
		
		
		
		
		
		 Actions a =new Actions(driver);
		a.dragAndDrop(source1, des1).build().perform();
		 
		WebElement closeBtn = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator icon-button mat-icon-button mat-button-base'])[2]"));	    
		
		closeBtn.click();				
				
			
		//WebElement exitbtn = driver.findElement(By.xpath("//span[contains(text(),'Exit Anyway')]"));
	//	exitbtn.click();
	//	impWait();
		
	
		
		driver.quit();
		
	}	
		
		

	}

