package pageFactoryCore;

import org.testng.annotations.BeforeMethod;

import pageFunctionsPageFactory.LoginPF;
import pageFunctionsPageFactory.PdpPF;




public class Initialize extends OpenAndCloseBrowser {
	
	protected LoginPF login ;
	protected PdpPF pdp ;
	
	
	@BeforeMethod
	public void initialize() {
		login = new LoginPF(driver);
		pdp = new PdpPF(driver);
	}

}