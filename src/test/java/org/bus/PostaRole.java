package org.bus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class PostaRole extends BaseClass{
	@Test
	private void postRole() {
		launchBrowser(browserkey);
		launchUrl();
		busLog();
		impWait();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    
		    // Wait until the element is clickable and locate the "Create Post" button using an XPath
		    WebElement postbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Post a Role')]")));
		    
		    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    
		    // Use the JavascriptExecutor to click the "Create Post" button
		    jsExecutor.executeScript("arguments[0].click();", postbtn);
		    
		    // Call your custom method 'impWait' if needed
		    impWait();
		    driver.quit();

	}

}
