package org.upplft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class Invalidlogin extends BaseClass {
    @Test
	private void inValLog() {
		// TODO Auto-generated method stub

	
		//invalid email and valid password
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		WebElement click = driver.findElement(By.xpath("(//a/span[contains(@class, 'candidate')])[1]"));
		clickButton(click);
	LoginPage pomLoginPage=new LoginPage();
		
		enterValue(pomLoginPage.getUser(), "rif@agileitexperts.com");
		enterValue(pomLoginPage.getPass(), "Admin@123");
		
		clickButton(pomLoginPage.loginBtn());
		
		String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    String url= "https://www.upplftstaging.com/authentication/login/candidate";
	    
	    if (url.equals(currentUrl)) {
	    	
	    	System.out.println("invalid email and valid password test case passed");
	    }
	    	else
	    	{
	    	
			System.out.println("invalid email and valid password test case Failed");
		}
	
		driver.navigate().refresh();
	
			
		enterValue(pomLoginPage.getUser(), "rifa@agileitexperts.com");
		enterValue(pomLoginPage.getPass(), "Admin@23");
		
		clickButton(pomLoginPage.loginBtn());
		
		
	    
	    if (url.equals(currentUrl)) {
	    	
	    	System.out.println("valid email and invalid password test case passed");
	    }
	    	else
	    	{
	    	
			System.out.println("valid email and invalid password test case Failed");
		}
	
		driver.navigate().refresh();
	
		
		//enterValue(pomLoginPage.getUser(), "rif@agileitexperts.com");
		enterValue(pomLoginPage.getPass(), "Admin@123");
		
		clickButton(pomLoginPage.loginBtn());
		
		
	    
	    if (url.equals(currentUrl)) {
	    	
	    	System.out.println("empty email and valid password test case passed");
	    }
	    	else
	    	{
	    	
			System.out.println("empty email and valid password test case Failed");
		}
	
		driver.navigate().refresh();
		
		enterValue(pomLoginPage.getUser(), "rifa@agileitexperts.com");
		//enterValue(pomLoginPage.getPass(), "Admin@123");
		
		clickButton(pomLoginPage.loginBtn());
		
		
	    
	    if (url.equals(currentUrl)) {
	    	
	    	System.out.println("valid email and empty password test case passed");
	    }
	    	else
	    	{
	    	
			System.out.println("valid email and empty password test case Failed");
		}
	
		driver.navigate().refresh();
		driver.close();
	
		
	}

			
		}
		
		
