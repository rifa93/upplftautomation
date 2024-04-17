package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class ContactPreference extends BaseClass {
	@Test
	private void conPref() throws Throwable {
		// TODO Auto-generated method stub

	
	

		launchBrowser(browserkey);
		launchUrl();
		candiLog();
		viewProf();
		WebElement scroll = driver.findElement(By.xpath("//mat-select[@name='residencyStatus']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		
		WebElement avail = driver.findElement(By.xpath("(//mat-select[@name='dayRate'])[2]"));
		Thread.sleep(2000);
		avail.click();
		
		
		List<WebElement> avail1 = driver.findElements(By.className("mat-option-text"));
		for (WebElement list : avail1) {
			System.out.println("the available options are :"+list.getText());
			
			
		}
		for (WebElement list : avail1) {
			list.click();
			impWait();
			System.out.println("the selected options are :"+list.getText());
			
			
		}
		
		
		for (WebElement list : avail1) {
			list.click();
			impWait();
			System.out.println("the deselected options are :"+list.getText());
			
			
		}
		
		simpleClick();
		profSave();
		driver.quit();
		

}
}