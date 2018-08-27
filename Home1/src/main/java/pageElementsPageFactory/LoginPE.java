package pageElementsPageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import pageFactoryCore.ActionDriver;


public class LoginPE extends ActionDriver{
	
	
	public LoginPE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()='Your Orders']/span")
	public WebElement yourOrders ;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement userName ;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password ;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit ;
	

}
