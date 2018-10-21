package homeTest;
import org.testng.annotations.Test;

import pageFactoryCore.Initialize;



public class LoginPF extends Initialize{
	@Test
	public void LoginAmazon()  {
		login.clickYourOrders();
		System.out.println("Login Done ....");
		login.LoginExcel();
		pdp.enterProductName();
		pdp.clickSearchButton();
	
}
}
