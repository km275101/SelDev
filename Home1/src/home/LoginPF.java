package home;
import org.testng.annotations.Test;

import pageFactoryCore.Initialize;



public class LoginPF extends Initialize{
	@Test
	public void LoginAmazon()  {
		System.out.println(" Login data from excel");
		login.clickYourOrders();
		login.LoginExcel();
		pdp.enterProductName();
		pdp.clickSearchButton();
	
}
}
