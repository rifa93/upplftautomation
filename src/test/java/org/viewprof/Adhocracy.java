package org.viewprof;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class Adhocracy extends BaseClass{
	@Test
	private void adhoCracy() throws InterruptedException {
		launchBrowser(browserkey);
		launchUrl();
		candiLog();
		viewProf();
		Thread.sleep(2000);
		WebElement retake = driver.findElement(By.xpath("(//span[contains(text(),'Re-take')])[2]"));
		retake.click();
		
		
		WebElement sourceElement = driver.findElement(By.xpath("//div[contains(text(),'Consistent')]"));
		WebElement targetElement = driver.findElement(By.xpath("//div[contains(text(),'1')]"));

		// Create a JavaScriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// JavaScript code for drag-and-drop operation
		String script = "arguments[0].dragAndDrop(arguments[1], arguments[2]);";

		// Execute the JavaScript code with the source and target elements as arguments
		js.executeScript(script, sourceElement, targetElement);
		
	        
	    /*    WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
		        WebElement  src=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Consistent')]")));
		
		WebElement  des=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'1')]")));
		
WebElement  src1=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Creative')]")));
		
		WebElement  des1=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'2')])[2]")));
		
WebElement  src2=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'productive')]")));
		
		WebElement  des2=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'3')])[2]")));
		
WebElement  src3=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Collaborative')]")));
		
		WebElement  des3=  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'4')])[2]")));
		
		
		Actions a =new Actions(driver);
	a.dragAndDrop(src,des).perform();
		
		a.dragAndDrop(src1,des1).perform();
		
		a.dragAndDrop(src2,des2).perform();

		a.dragAndDrop(src3,des3).perform();*/
		
		
		  Thread.sleep(3000);
		  
     driver.quit();
	}

}
