package org.bus;

import org.testng.annotations.Test;
import org.upplft.BaseClass;

public class Login extends BaseClass {
	@Test
	private void loginBus() throws InterruptedException {
		launchBrowser(browserkey);
		launchUrl();
		busLog();
		busProf();
		impWait();
		
		driver.quit();
        
	}

}
