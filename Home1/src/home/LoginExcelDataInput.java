package home;
import org.testng.annotations.Test;

import test.Initialize;

public class LoginExcelDataInput extends Initialize{
	@Test
	public void LoginAmazon() throws InterruptedException {
		System.out.println(" Login data from excel");
		login.clickYourOrders();
		login.LoginExcel();
		pdp.searchProduct();
	}
	
	

}
