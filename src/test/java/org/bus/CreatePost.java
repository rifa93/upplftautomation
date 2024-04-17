package org.bus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class CreatePost extends BaseClass{
	
	@Test
	private void crtPost() throws Throwable {
		launchBrowser(browserkey);
		launchUrl();
		busLog();
		impWait();
		 // Create a WebDriverWait instance with a 30-second timeout
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    
	    // Wait until the element is clickable and locate the "Create Post" button using an XPath
	    WebElement crtpostbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Create Post')]")));
	    
	    // Create a JavascriptExecutor instance by casting the WebDriver instance
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    
	    // Use the JavascriptExecutor to click the "Create Post" button
	    jsExecutor.executeScript("arguments[0].click();", crtpostbtn);
	    
	    // Call your custom method 'impWait' if needed
	    impWait();
		
		WebElement title = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		title.sendKeys("Hiring developer ");
	
		WebElement hashtag = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		hashtag.sendKeys("#create");
		
		WebElement para = driver.findElement(By.xpath("//div[@role='textbox']"));
		enterValue(para, "sampletext");
		
		WebElement publishbtn = driver.findElement(By.xpath("//button[contains(text(),' Publish ')]"));
		publishbtn.click();

		WebElement veiwprof = driver.findElement(By.xpath("//span[contains(text(),' View Post ')]"));
		veiwprof.click();
		
		
		WebElement drop = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
		drop.click();
		
		WebElement delpost = driver.findElement(By.xpath("//a[contains(text(),'Delete Post')]"));
		delpost.click();
		
		Thread.sleep(2000);
		//WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement yesbtn = driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
		yesbtn.click();
		impWait();
		
		
		driver.quit();

	}

}
