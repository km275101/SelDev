package homeTest;
import org.testng.annotations.Test;

import pageFactoryCore.Initialize;



public class LoginPF extends Initialize{
	@Test
	public void LoginAmazon()  {
		login.clickYourOrders();
		login.LoginExcel();
		pdp.enterProductName();
		pdp.clickSearchButton();
	
}
}
