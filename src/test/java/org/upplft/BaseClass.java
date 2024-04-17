package org.upplft;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	public static String browserkey ="Chrome";
	public static void launchBrowser (String browser) {
	if (browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		
	}
	 else if(browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		
	}
	
	 else {
		 WebDriverManager.edgedriver().setup();
		 driver =new EdgeDriver();
		
	}
	
}
	public static void launchUrl() {
	   driver.get("https://upplftstaging.com:81/");
	   driver.manage().window().maximize();
	   String title = driver.getTitle();
	   System.out.println(title);
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);

	}
	public static void enterValue(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void clickButton(WebElement e) {
		e.click();
	}
	

	public static void impWait() {
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	 public static void tabBtn() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
	 public static void moveCursor(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e);
		

	}
	 public static void simpleClick() {
		 Actions actions = new Actions(driver);

	        // Perform a click at specific coordinates (x, y)
	        actions.moveByOffset(100, 200).click().perform();

	}
	 
	 public static void candiLog() {
		 WebElement click = driver.findElement(By.xpath("(//a/span[contains(@class, 'candidate')])[1]"));
	       
			
			clickButton(click);
			LoginPage pomLoginPage=new LoginPage();
			//ULT_Tc_019:to Check if the log in info appears at top right after successful login
			enterValue(pomLoginPage.getUser(), "rifa@agileitexperts.com");
			enterValue(pomLoginPage.getPass(), "Admin@123");
			
			
			clickButton(pomLoginPage.loginBtn());
			impWait();	
	}
	
	 
	 public static void viewProf() {
		 WebElement profbutton = driver.findElement(By.className("skip-btn"));
			profbutton.click();

	}
	 
	 public static void profSave() {
		  WebElement sveBtn = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
	        sveBtn.click();
	 }
	 
	 public static void screenShot(String name) throws SecurityException, IOException {
		 
		 TakesScreenshot ts= (TakesScreenshot)driver;
		 File srcFile = ts.getScreenshotAs(OutputType.FILE);
		 File desfile =new File("C:\\Users\\user\\eclipse-workspace\\upplift\\src\\test\\resources\\ScreenShots"+name+".png");
	   org.openqa.selenium.io.FileHandler.copy(srcFile, desfile);
		 
	
}
	public static void busLog() {
		WebElement log = driver.findElement(By.xpath("//span[contains(text(),'Business Log In')]"));
	    log.click();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("business@eunoiad.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Business@1");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    impWait();
	
	
	}
	public static void busProf() {
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(90));
    WebElement prof = w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.view-profile-btn")));
    
    // Use JavaScript executor to click the element
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", prof);
}
	
}