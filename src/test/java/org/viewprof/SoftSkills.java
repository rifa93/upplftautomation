package org.viewprof;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class SoftSkills extends BaseClass {
	
	@Test
	private void softSkill() {
		
		launchBrowser(browserkey);
		launchUrl();
		candiLog();
		viewProf();
		
		WebElement move = driver.findElement(By.xpath("//mat-select[@name='industry']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView(true);",move);
		  
		
		WebElement soft = driver.findElement(By.id("searchBtn"));
		soft.click();
		
		List<WebElement> softlist = driver.findElements(By.id("mat-autocomplete-3"));
		for (WebElement allList : softlist) {
			System.out.println("the available soft skills are :"+allList.getText());
			
		}
		for (int i = 0; i <softlist.size(); i++) {
		     softlist.get(i).click();
		     impWait();
		     WebElement add = driver.findElement(By.className("upload-btn"));
             add.click();
             impWait();
             soft.click();
		     impWait();
		     while (i>11) {
		    	 try {
		    		 softlist.get(10).click();
		             // If selecting option 11 doesn't throw an exception, the test fails
		             Assert.fail("Option 11 should not be selectable");
				} catch (Exception e) {
					e.printStackTrace();				}
				
			}
			
			
			driver.quit();
			
		}		
		
	}

}
