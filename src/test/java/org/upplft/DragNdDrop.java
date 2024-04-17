package org.upplft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragNdDrop extends BaseClass {
	public static void main(String[] args) {
		launchBrowser(browserkey);
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		WebElement src = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		WebElement des = driver.findElement(By.id("mydropzone"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).build().perform();
		
	}

}
