package org.bus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class IndustryDropdown extends BaseClass{
	@Test
	private void typBus() throws Throwable {
    launchBrowser(browserkey);
    launchUrl();
    busLog();
    busProf();
   
    WebElement typ = driver.findElement(By.name("industry"));
    Thread.sleep(1000);
    typ.click();
    
    
    List<WebElement> typlist = driver.findElements(By.className("mat-option-text"));
    impWait();
    for (WebElement allList : typlist) {
    	
    	System.out.println("The available type of business are: "+allList.getText());
		
	}
    for (WebElement allList : typlist) {
    	
    	allList.click();
    	impWait();
    	System.out.println("The selected type of business is: "+allList.getText());
    	typ.click();
		
	}
    simpleClick();
    busProfSave();
    driver.quit();
	}


}
