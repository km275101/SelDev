package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataprovider.LogindataProvider;

public class Login {
	
	LogindataProvider ldp = new LogindataProvider();
	
	WebDriver driver;
	
	By yourOrders = By.xpath("//span[text()='Your Orders']/span");
	By userName = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By submit = By.xpath("//input[@type='submit']");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String strUser) {
		
		//driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(strUser);;
	}
	
	public void setPass(String strPass) {
		
		//driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPass);
	}
	
    public void clickLogin() throws InterruptedException {
		
		driver.findElement(submit).click();
		Thread.sleep(10000);
	}
    
    public void clickYourOrders() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(yourOrders).click();
		
	}
    
	public void LoginToAmazon(String strUser,String strPass) throws InterruptedException {
		//this.clickYourOrders();
		this.setUsername(strUser);
		this.clickLogin();
		this.setPass(strPass);
		this.clickLogin();
	}
	
	
	public void LoginExcel() {
		try {
			String username = ldp.getUserDetails().get(0);
			String pass = ldp.getUserDetails().get(1);
			this.setUsername(username);
			this.clickLogin();
			this.setPass(pass);
			this.clickLogin();
		}catch(Exception e) {
			System.out.println("Unable to login :"+e);
		}
	}
}
