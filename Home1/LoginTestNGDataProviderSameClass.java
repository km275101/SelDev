package home;
import org.testng.annotations.Test;
import pageElements.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class LoginTestNGDataProviderSameClass {
	WebDriver driver;
	Login login;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Stating........TestNGWith Parameter");

		System.setProperty("webdriver.chrome.driver", "E:\\iMp\\drivers\\chromedriver.exe");
		String baseUrl = "https://www.amazon.in/";
		Thread.sleep(5000);
		driver = new ChromeDriver();
		System.out.println("Opned........");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		
	}

	@Test(dataProvider="dataproviderTestNG")
	public void LoginAmazon(String userName,  String Pass) throws InterruptedException {
		login = new Login(driver);
		System.out.println(" Test NG Parameters are data 1 : "+userName+" and "+Pass);
		login.clickYourOrders();
		login.LoginToAmazon(userName, Pass);
		// login.clickLogin();
	}
	
	@DataProvider(name="dataproviderTestNG")
	public Object[][] dataProvider(){
		Object[][] data = new Object[1][2];
		
		data[0][0] = "km275101@gmail.com";
		data[0][1] = "kame9454";
		
		return data;
		
	}

}
