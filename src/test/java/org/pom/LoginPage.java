package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.upplft.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="mat-input-0")
	private WebElement user;
	
	@FindBy(id="mat-input-1")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement log;
	
    @FindBy(id="email")
    private WebElement user1;
    
    
  @FindBy(xpath="(//input[@type='password'])[1]")
  private WebElement pass1;
	
  @FindBy(xpath="(//input[@type='password'])[2]")
  private WebElement pass2;
	
	public WebElement getUser() {
		return user;
		
	}

	public WebElement getPass() {
		return pass;
		
	}
    public WebElement signinEmail() {
    	return user1;
    	
    }
    public WebElement signinPass1() {
    	return pass1;
    	
    }
    public WebElement signinPass2() {
    	return pass2;
    	
    }
	public WebElement loginBtn() {
		return log;
		
	}
}
