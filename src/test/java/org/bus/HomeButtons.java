package org.bus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class HomeButtons extends BaseClass {
	
	@BeforeTest
	private void urlLaunch() throws Throwable {
		launchBrowser(browserkey);
		launchUrl();
		busLog();
		
	}
	@AfterTest
	private void endBrow() {
		// TODO Auto-generated method stub
driver.quit();
	}  
	
     @Test	(priority=1)
		private void pipBtn() {
			// TODO Auto-generated method stub

		
		WebElement pip = driver.findElement(By.xpath("//span[contains(text(),'Pipeline')]"));
		pip.click();
		
		
		String pipurl = driver.getCurrentUrl();
		System.out.println(pipurl);
		String actpipurl="https://upplftstaging.com:81/dashboards/business/pipeline";
	    
	    if (pipurl.equals(actpipurl)) {
	    	System.out.println("Result as Expected");
	    }
	    else {
			System.out.println("Result not as Expected");
			Assert.fail();
		}
		}
     @Test(priority=2)
	private void roleBtn() {
		WebElement role = driver.findElement(By.xpath("//span[contains(text(),'Roles')]"));
		role.click();
		String rolcururl = driver.getCurrentUrl();
		String acturl="https://upplftstaging.com:81/dashboards/business/roles";
		Assert.assertEquals(acturl, rolcururl,"error message");
		
		if(!rolcururl.equals(acturl)) {
			Assert.fail("unexpected behaviour");
		}

	}
     @Test(priority=3)
     private void calBut() {
		String Acturl ="https://upplftstaging.com:81/scheduler";
		WebElement Calurl = driver.findElement(By.xpath("//span[contains(text(),'Calendar')]"));
		Calurl.click();
		String calcururl = driver.getCurrentUrl();
Assert.assertEquals(Acturl, calcururl,"error message");
		
		if(!calcururl.equals(Acturl)) {
			Assert.fail("unexpected behaviour");
		}

	}
     @Test(priority=4)
     private void setBut() throws Throwable {
    	 
    	 driver.navigate().refresh();
    	 impWait();
		
		WebElement Calurl1 = driver.findElement(By.xpath("//span[contains(text(),'Settings')]"));
		Calurl1.click();
	     impWait();
		String calcururl1 = driver.getCurrentUrl();
		System.out.println(calcururl1);
		
		String Acturl1 ="https://upplftstaging.com:81/dashboards/business/home";
Assert.assertEquals(Acturl1, calcururl1,"error message");
		
		if(!Acturl1.equals(calcururl1)) {
			Assert.fail("unexpected behaviour");
		}
		driver.quit();
	}
     
	    
}
