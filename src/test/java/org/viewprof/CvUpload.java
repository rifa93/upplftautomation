package org.viewprof;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class CvUpload extends BaseClass {
	
	@Test
	private void cvUpl() {
		launchBrowser(browserkey);
		launchUrl();
		candiLog();
		viewProf();
		
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Domain Experience')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);" ,element);
		
		
		
		WebElement element2 = driver.findElement(By.xpath("//input[contains(@placeholder, 'CV Upload')]"));
		element2.click();
		String filePath = "C:\\Users\\user\\ENVIRO.pdf"; 
		element2.sendKeys(filePath);

	}

}
