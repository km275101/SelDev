package pageElementsPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageFactoryCore.ActionDriver;

public class PdpPE extends ActionDriver{
	
	public PdpPE(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement productIpone;
	
	@FindBy(xpath="//input[@class='nav-input']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchBox;
	
	
}
