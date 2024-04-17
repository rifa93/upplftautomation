package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class SalaryBase extends BaseClass{
    @Test
	private void salBase() throws Throwable {
		// TODO Auto-generated method stub
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
    	
        
        WebElement salbut = driver.findElement(By.xpath("//mat-select[@name='salary']"));
        salbut.click();
        Thread.sleep(3000); 
        salbut.click();
        List<WebElement> saldrop = driver.findElements(By.className("mat-option-text"));
        for (WebElement saldrop1 : saldrop) {
        	String sallist = saldrop1.getText();
           System.out.println("the available salary base list is: "+sallist);
			
		}
        for (WebElement saldrop1 : saldrop) {
        	saldrop1.click();
        	impWait();
        	String sallist = saldrop1.getText();
           System.out.println("the selected salary base list is: "+sallist);
           salbut.click();
        }
        
        
        simpleClick();
        profSave();
        driver.quit();
	}
	
}
