package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataprovider.SearchProductdataProvider;

public class PDP {
	WebDriver driver;
	SearchProductdataProvider sdp = new SearchProductdataProvider();
	
	By productIpone = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchBtn = By.xpath("//input[@class='nav-input']");
	By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	
	
	public PDP(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterProdName(String pName) {
		driver.findElement(searchBox).clear();
		System.out.println("Clear successfully");
		driver.findElement(searchBox).sendKeys(pName);
	}
	public void searchProduct() {
		try {
			String productName = sdp.getProducts().get(0);
			System.out.println(" Product name is "+productName);
			driver.findElement(searchBox).sendKeys(productName);
			Thread.sleep(10000);
			//this.enterProdName(productName);
			driver.findElement(searchBtn).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
