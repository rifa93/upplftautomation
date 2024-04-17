package org.upplft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageButtons extends BaseClass {
	
@Test
private void homPage() {
	// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		//Candidate login button: ULT_Tc_006
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		WebElement click = driver.findElement(By.xpath("(//a/span[contains(@class, 'candidate')])[1]"));
       
		
		clickButton(click);
		impWait();
		//Candidate login button:ULT_Tc_006
		String url="https://www.upplftstaging.com/authentication/login/candidate";
		String currentUrl = driver.getCurrentUrl();
		if(url.equals(currentUrl)) {
		System.out.println("candidate login button working");
		}
		else {
			System.out.println("candidate login button not working");
		}
        //candidate login back button:ULT_Tc_009
		
		WebElement backButton = driver.findElement(By.xpath("//button[@aria-label='Back']"));
	     clickButton(backButton);
	     
	     String url1= "https://www.upplftstaging.com/authentication/login-option";
	     String currentUrl2 = driver.getCurrentUrl();
	     if (url1.equals(currentUrl2)) {
	    	 System.out.println("candidate login back button working");
			}
			else {
				System.out.println("candidate login back button not working");
			}
	    	 
	    	driver.navigate().refresh();
	    	
	    	
	    	//Business login button :ULT_Tc_007
	    	
	    	WebElement Businesslogin = driver.findElement(By.xpath("//a[@href='/authentication/login/business']"));
	    	clickButton(Businesslogin);
	    	
	    	String BusinessUrl="https://www.upplftstaging.com/authentication/login/business";
	    	String curBusurl = driver.getCurrentUrl();
	    	if (BusinessUrl.equals(curBusurl))  {
	    		System.out.println("Business login button working");
			}
			else {
				System.out.println("Business login button not working");
			}
	    		
				
			
	    	//Business login back button :ULT_Tc_010
	    	
	    	 

			WebElement bbackButton = driver.findElement(By.xpath("//button[@aria-label='Back']"));
		     clickButton(bbackButton);
		
		     String url2= "https://www.upplftstaging.com/authentication/login-option";
		     String currentUrl3 = driver.getCurrentUrl();
		     if (url2.equals(currentUrl3)) {
		    	 System.out.println("Business login back button working");
				}
				else {
					System.out.println("Business login back button not working");
				}
		    	 
		    	driver.navigate().refresh();
		//Back button in Home page:ULT_Tc_008
		    	WebElement homebackButton = driver.findElement(By.xpath("//button[@aria-label='Back']"));
			     clickButton(homebackButton);
			     String CurrentHome = driver.getCurrentUrl();
			     String HomeUrl="https://www.upplft.com/";
			     
			     if (CurrentHome.equals(HomeUrl)) {
					System.out.println("home back button is working");
			     }
					else {
						System.out.println("home back button is not working");
					
				}
			     driver.close();
	}
	

}
