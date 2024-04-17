package org.upplft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pom.LoginPage;
import org.testng.annotations.Test;

public class Settings extends BaseClass {
  @Test
	private void seTing() throws Throwable {
		// TODO Auto-generated method stub

	
	
	launchBrowser(browserkey);
		launchUrl();
		impWait();
		candiLog();
		
		WebElement settingsbtn = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[4]"));
		settingsbtn.click();
	    Thread.sleep(3000);
		
		//to Check if the candidate account option is available
		//to check if the candidate account option is working
		WebElement canAcc = driver.findElement(By.xpath("//div[contains(@class,'accordian-style')]//i[contains(@class,'fa-angle-right')]"));
		boolean canAcc1 = canAcc.isDisplayed();
		if (canAcc1==true) {
			System.out.println("Candidate account is available");
			
		} else {
			System.out.println("Candidate account is not available");

		}
		impWait();
		
		canAcc.click();
		
		
		String actUrl="https://www.upplftstaging.com/dashboards/candidate-account";
		String currentUrl = driver.getCurrentUrl();
		if (actUrl.equals(currentUrl)) {
			System.out.println("Candidate account button is working");
		} else {
            System.out.println("Candidate account button not working");
		}
		
	impWait();
				//To check if the first name box is present
	//To check if we can enter valid data in first name box and save
	WebElement editBtn = driver.findElement(By.className("pr-2"));
		editBtn.click();
		impWait();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.clear();
		impWait();
		enterValue(firstName, "Rifaudeen");
		String att1 = firstName.getAttribute("value");
		if(att1.equals("Rifaudeen")) {
			System.out.println("entered input is correct");
		}
		else 
			System.out.println("input is wrong");
		
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.clear();
		enterValue(lastName, "Mohaideen Abdul Kader");
		impWait();
		

		//WebElement eMail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		//eMail.clear();
		//enterValue(eMail, "afir4u@gmail.com"); 
		//eMail.clear();
	    //impWait();

		WebElement phoneNum = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		phoneNum.clear();
		enterValue(phoneNum, "02828282828");
		String enPhNo = phoneNum.getAttribute("value");
		String PhNo = "02828282828";
		if(enPhNo.equals(PhNo))
			System.out.println("entered data matches");
		else {
			System.out.println("data doesnt match");
		}
		impWait();
		WebElement dropList = driver.findElement(By.id("mat-select-6"));
		dropList.click();
		impWait();
		
		WebElement aus = driver.findElement(By.xpath("//span[contains(text(),'Africa')]"));
		aus.click();
		
		impWait();
		
		String indtext = aus.getText();
		if(indtext.equals("Africa"))
		{System.out.println("Africa is selected");
		}
		
		else 
		{
			System.out.println("Africa not selected");
		}
		
		
		

		
		
		
		
		WebElement submitbtn = driver.findElement(By.className("mat-raised-button"));
		submitbtn.click();
		
		
	
		
		//driver.quit();
		}
				//to check if we can enter invalid name format and save successfully
				//To check if we can enter valid data in Lastname box and save
				//to check if we can leave Last name box empty and save successfully
				//to check if we can enter invalid name format in last name and save successfully
				//To check if we can enter valid email in email box and save
				//to check if we can leave email box empty  in email feild and save successfully
				//to check if we can enter invalid email format in email box and save successfully
				//to check if we can enter valid phone number format in phone number box
				//to check if we can enter invalid fone number format and save sucessfully
				//to check if we can leave phone number box empty and save successfully
				//to check if the country option is available
				//to check if the country option is working and the list of countries are available in dropdown
				//To check if the country option is multi selectable
				//To Check if date of birth option is available
				//to check if the dob dropdown is selectable
				//to check if we can select dob which is below 18 years old age
				//To check if have select identity option
				//to check if  select identity option is working
				//to check if options are available in select identity
				//to check if the select identity is multi selectable
				//to Check if the about upplift content (requirement ) is available
				//To check if we can change email address using valid email
				//To check if we can change email address using existing email
				//To check if we can change email address using invalid email
				//to check if we can leave email box empty  in email feild and save successfully
				//To check if the back button in chanage email is working
				//To check if the current password box is available
				//To check if we can enter valid password  current password
				//To check if the enter wrong password in current password box
				//To check if the eye icon in current password box is available
				//To check if the eye icon in current password box is working
				//To check if the new password box is available
				//To check if we can enter new password in new password box
				//To check if the enter wrong password format in new password box
				//To check if the eye icon in new password box is Available
				//To check if the eye icon in new password box is working
				//To check if the Confirm new password box is available(same as new password)
				//To check if we can enter new password in Confirm new password box(different password to new password)
				//To check if the eye icon in Confirm  new password box is Available
				//To check if the eye icon in confirm new password box is working
				//To check if the back button in change password is available
				//To check if the back button in change password is working
				//To check if the FAQs option is available
				//To check if the FAQs option is Working
				//To check if the list of options FAQs option is Working
				//To check if the de activate option is available
				//To check if the de activate account option is Working
				//To check if the all the options are available in select reason for deactivating account(Requirement)
				//to check if the reason for deactivating options are selectable
				//to check if the reason for deactivating can be multiselected
				//to check if the submit button in deactivate account is enabled without selecting any reason for deactivation
				//to check if the submit button in deactivate account is enabled after selecting reason for deactivation
				//to check if the submit button in working
				//to check if the pop up appears with content as per requirement after clicking submit button
				//to check if the yes button works in deactivate account conformation pop up
				//to check if the no button works in deacticate account conformation pop up
				//To check if the back button is working in deactivate account
				
		

	}


