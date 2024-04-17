package org.upplft;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class Signup extends BaseClass{
    @Test
	private void signUp() throws Throwable {
		// TODO Auto-generated method stub

	
		
		launchBrowser(browserkey);
		launchUrl();
		impWait();
		WebElement click = driver.findElement(By.xpath("(//a/span[contains(@class, 'candidate')])[1]"));
		clickButton(click);
		
		
		LoginPage pom =new LoginPage();
		
		//ULT_Tc_011:To check whether we can enter valid email id in email box
		WebElement Signup = driver.findElement(By.xpath("//strong[text()='Sign Up']"));
		clickButton(Signup);
		
		enterValue(pom.signinEmail(), "rifa@agileitexperts.com");
		String enteredmail = pom.signinEmail().getAttribute("value");
		if (enteredmail.equals("rifa@agileitexperts.com")) {
			System.out.println("valid email id is entered");
			
		}
		else {
			System.out.println("valid email id is not entered");
		}
		
		driver.navigate().refresh();
		
		//ULT_Tc_012:To check whether we can enter invalid email id  format and error message is displayed
		
	
		
		enterValue(pom.signinEmail(), "11111111");
	
		
		tabBtn();
		
		Thread.sleep(1000);
		
		String ActErrMsg="Enter Valid email Id";
		
		 WebElement errorMsg1 = driver.findElement(By.xpath("//span[contains(text(),' Enter Valid email Id ')]"));
		String errortext1 = errorMsg1.getText();
		System.out.println("the error message is:  "+errortext1);
		
		if (ActErrMsg.equals(errortext1)) {
			System.out.println("error message printed successfully");
			
		}
		else {
			System.out.println("error message printed successfully");
		}
		
		driver.navigate().refresh();
		//ULT_Tc_013:To check whether we can enter valid password format
		
		enterValue(pom.signinPass1(), "Admin@123");
		String enteredpassword = pom.signinPass1().getAttribute("value");
		
		System.out.println(enteredpassword);
		
		
		driver.navigate().refresh();
		
		//ULT_Tc_013:To check whether we can enter invalid password format
		
		enterValue(pom.signinPass1(), "11111");
		tabBtn();
		
		WebElement errormsg2 = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		String errortext2 = errormsg2.getText();
        System.out.println("the error message in password feild is : "+errortext2);
        String ActErrMsg1="Password should be at least 8 characters long and should contain one number, one lower case and one upper case character and one special character (e.g. @ * $ % ! #)";
        if (ActErrMsg1.equals(errortext2)) {
        	System.out.println("error message is seen");
			
		}
        else {
        	System.out.println("error message not seen");
        }
        driver.navigate().refresh();
        
        //ULT_Tc_015:To check whether we can enter valid password format inRetpye password box
        
        enterValue(pom.signinPass2(), "Admin@123");
        String enteredpassword1 = pom.signinPass2().getAttribute("value");
        System.out.println(enteredpassword1);
        driver.navigate().refresh();
        
        
        //ULT_Tc_016:To check if the retype password is matching password
        enterValue(pom.signinPass1(), "Admin@123");
        enterValue(pom.signinPass2(), "Admin@12");
         @SuppressWarnings("unused")
		boolean Passerror = driver.findElement(By.xpath("//span[contains(text(),' Passwords do not match. ')]")).isDisplayed();
        
        if (Passerror=true) {
        	System.out.println("error message is displayed");
        	
			
		}
        else {
			System.out.println("error message not displayed");
		}
        
       driver.navigate().refresh();
      
     //ULT_Tc_019: To check if the sign up button is enabled after entering valid email and password format
        enterValue(pom.signinEmail(), "rifa@agileitexperts.com");
        enterValue(pom.signinPass1(), "Admin@123");
        enterValue(pom.signinPass2(), "Admin@123");
        
        
        boolean enablesignup = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        
        if(enablesignup=true){
        	System.out.println("Sign up button is enabled");
        }
        else {
        	
        	System.out.println("Sign up button is not enabled");
        }
        driver.navigate().refresh();
        //ULT_Tc_019: To check if the sign up button is enabled after entering valid email and password format and clearing it
        
        enterValue(pom.signinEmail(), "rifa@agileitexperts.com");
        enterValue(pom.signinPass1(), "Admin@123");
        enterValue(pom.signinPass2(), "Admin@123");
        
        
        
        driver.navigate().refresh();
       
        
        Thread.sleep(2000);
        
        @SuppressWarnings("unused")
		boolean disablesignup = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        
        if(disablesignup = enablesignup){
        	System.out.println("Sign up button is not enabled(test case passed)");
        }
        else {
        	
        	System.out.println("Sign up button is enabled(test case failed)");
        }
        driver.close();
        
        
	
	
	}

}