package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class TechSkills extends BaseClass{
	
	@Test
	private void techSkl() throws Throwable {
		launchBrowser(browserkey);
		launchUrl();
		candiLog();
		viewProf();
		Thread.sleep(2000);
		
		WebElement move = driver.findElement(By.xpath("//mat-select[@name='industry']"));
		
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);",move);
	    
	    Thread.sleep(2000);
	    
	    WebElement tech= driver.findElement(By.xpath("//input[@data-placeholder='Type answers...']"));
	    
	    tech.click();
	    Thread.sleep(2000);
	    
	   List<WebElement> techList = driver.findElements(By.id("cdk-overlay-1"));
	   	    for (WebElement AllList : techList) {
	    	
	    	String listOpt = AllList.getText();
	    	impWait();
	  System.out.println("the available tech skills are :"+listOpt);
			
		}
	    impWait();
	  WebElement Acas = driver.findElement(By.xpath("//span[contains(text(),' ACAS ')]"));
	  Acas.click();
	  impWait();
	  
	  WebElement savBtn = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator upload-btn col-sm-12 col-lg-1 col-md-1 mat-raised-button mat-button-base'])[2]"));
	  boolean enabled = savBtn.isEnabled();
	  if (enabled==true) {
		System.out.println("Add button enabled");
	}
	  savBtn.click();
	    
	   impWait();
		
		driver.quit();

	}

}
