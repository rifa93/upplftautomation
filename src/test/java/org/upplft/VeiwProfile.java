package org.upplft;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class VeiwProfile extends BaseClass{
    @Test
	private void viewProfile1() throws Throwable {
		// TODO Auto-generated method stub


		
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		candiLog();
	
		
				WebElement profbutton = driver.findElement(By.className("skip-btn"));
				boolean profbut1 = profbutton.isDisplayed();
				if (profbut1==true) {
					System.out.println("view profile button is available");
					
				}
				else
				{System.out.println("view profile button not available");
				}
				String viewproftext = profbutton.getText();
				
				System.out.println("the view profile button text is : " +viewproftext);
				
				// ULT_Tc_033:to check if the view profile button is working
				
				
				
				WebElement profbutton1 = driver.findElement(By.className("skip-btn"));
				profbutton1.click();
				Thread.sleep(2000);
				
				screenShot("Profilepage");
				
				
	
				
		        WebElement dropdown = driver.findElement(By.xpath("//mat-select[@name='gender']"));

		        // Click on the dropdown to open it
		        dropdown.click();

  
		        List<WebElement> identity = driver.findElements(By.className("mat-option-text"));
		        
		        for (WebElement idenList : identity) {
					String idenOpt = idenList.getText();
					System.out.println("The gender dropdown options are: "+idenOpt);
				} 
				for (WebElement idenList : identity) {
					String idenOpt = idenList.getText();
					idenList.click();
					System.out.println("the selected option is :"+idenOpt);
					impWait();
				dropdown.click();
				
				impWait();
				
				
				} 
			simpleClick();
        WebElement sveBtn = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
        sveBtn.click();
        impWait();
			
			
	          
driver.quit();
	}

}
