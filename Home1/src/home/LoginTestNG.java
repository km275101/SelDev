package home;
import org.testng.annotations.Test;
import pageElements.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTestNG {
	WebDriver driver;
	Login login;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Stating........TestNG");

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

	@Test
	public void LoginAmazon() throws InterruptedException {
		login = new Login(driver);
		System.out.println("Starting Tsst NG");
		login.clickYourOrders();
		login.LoginToAmazon("km275101@gmail.com", "kame9454");
		// login.clickLogin();
	}

}
