package org.bus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class HiringToggleButton extends BaseClass {
	@Test
	private void hirTogBut() throws InterruptedException {
		launchBrowser(browserkey);
		launchUrl();
		busLog();
		busProf();
		Thread.sleep(3000);
		WebElement togbtn = driver.findElement(By.xpath("//input[@id='mat-slide-toggle-6-input']"));
		boolean togenab = togbtn.isEnabled();
		

		if(togenab==true) {
			togbtn.click();
			impWait();
			System.out.println("the toggle button is already selected and its unselected");
			
		}
		else {
			togbtn.click();
			impWait();
			System.out.println("the toggle button is not selected and its now selected");
		}
			
	}
	

}
