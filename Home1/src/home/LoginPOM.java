package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageElements.Login;

public class LoginPOM {
		
		public void setup() {}
		public void run() {
			
		}
	static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
	System.out.println("Stating........");
	System.out.println("Stating........");
	System.out.println("Stating........");
	Login login = new Login(driver);
	System.setProperty("webdriver.chrome.driver", "E:\\iMp\\drivers\\chromedriver.exe");
	String baseUrl = "https://www.amazon.in/";
	Thread.sleep(5000);
	WebDriver driver = new ChromeDriver();
	System.out.println("Opned........");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.get(baseUrl);
	
	
	login.LoginToAmazon("km275101@gmail.com" ,"kame9454");
	login.clickLogin();
}
}
