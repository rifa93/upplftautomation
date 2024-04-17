package org.upplft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class Matches extends BaseClass {
    @Test
	private void matchPage() throws Throwable {
		// TODO Auto-generated method stub

	
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		candiLog();
		
		
		WebElement matchesbtn = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		matchesbtn.click();
		// ULT_Tc_028:to check if the search bar is present
		
		impWait();
		WebElement Homebut = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[1]"));
		Homebut.click();
		impWait();
		
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		boolean searchpresent = search.isDisplayed();
		if (searchpresent==true) {
			System.out.println("search bar is available");
		}
		else {
			System.out.println("Search bar not available");
			
		}
	
//to check if the location(matches menu) dropdown is available
//to check if the location(filter) dropdown is working
         matchesbtn.click();
		
Thread.sleep(2000);
WebElement locDrop = driver.findElement(By.xpath("(//mat-select[@role='combobox'])[1]"));
locDrop.click();
impWait();
boolean locDrop1 = locDrop.isDisplayed();
if (locDrop1==true) {
	System.out.println("Location dropdown is displayed");
}

else {
	System.out.println("dropdown not displayed");
}
impWait();
WebElement melbourne = driver.findElement(By.xpath("//span[contains(text(),' Melbourne ')]"));
melbourne.click();

Thread.sleep(2000);

//Locate the checkbox element by its class name
WebElement checkbox = driver.findElement(By.className("mat-pseudo-checkbox-checked"));

// Check if the checkbox is displayed
if (checkbox.isDisplayed()) {
    System.out.println("Checkbox is displayed.");
}
    // Check if the checkbox is selected
    if (checkbox.getAttribute("class").contains("mat-pseudo-checkbox-checked")) {
        System.out.println("Checkbox is selected.");
        // Additional actions if checkbox is selected
    } else {
        System.out.println("Checkbox is not selected.");
        // Additional actions if checkbox is not selected
    }
//if (melsel==true) {
	//System.out.println("Melbourne is selected");
	//} else {
//	System.out.println("Melbourne is not selected");

//}

//To check if the the set of options are available under location filter dropdrown
screenShot("location options");

//to check if the search button is working after selecting location checkbox from the dropdown
Actions actions = new Actions(driver);
actions.moveByOffset(10, 0).click().perform();
WebElement searchloc = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
searchloc.click();


driver.quit();

	}

}
