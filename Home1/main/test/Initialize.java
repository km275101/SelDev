package test;

import org.testng.annotations.BeforeMethod;

import pageElements.Login;
import pageElements.PDP;

public class Initialize extends OpenAndCloseBrowser {
	
	protected Login login ;
	protected PDP pdp ;
	
	
	@BeforeMethod
	public void initialize() {
		login = new Login(driver);
		pdp = new PDP(driver);
	}

}