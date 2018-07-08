package home;

import org.testng.annotations.DataProvider;

public class DataProviderParameter {
	@DataProvider(name="dataProviderTestNG")
	public static Object[][] dataProvidr(){
	
		Object[][] data = new Object[1][2];
		
		data[0][0] = "km275101@gmail.com";
		data[0][1] = "kame9454";
		
		return data;
		
			
	}
}
