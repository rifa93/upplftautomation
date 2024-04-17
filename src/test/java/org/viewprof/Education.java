package org.viewprof;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class Education extends BaseClass {
	//public static void main(String[] args) throws InterruptedException {
	@Test
	private void eduDrop() throws Throwable {
		// TODO Auto-generated method stub

	
		BaseClass obj =new BaseClass();
		launchBrowser(obj.browserkey);
		launchUrl();
		impWait();
		candiLog();
		viewProf();
		
		
        WebElement Edu = driver.findElement(By.xpath("//mat-select[@name='education']"));
		
		Thread.sleep(1000);
		Edu.click();
	   
	
		List<WebElement> eduList = driver.findElements(By.className("mat-option-text"));
		for (WebElement droplist : eduList) {
			String dropList1 = droplist.getText();
			System.out.println("the available education options are :"+dropList1);
			
		}
		for (WebElement droplist : eduList) {
			String dropList1 = droplist.getText();
			droplist.click();
			impWait();
			System.out.println("the selected education options are :"+dropList1);
			Edu.click();
			
		}
		simpleClick();
		profSave();
		driver.quit();
			
			
		
		
	}


}