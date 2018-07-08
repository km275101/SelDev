package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PDP {
	WebDriver driver;
	
	By productIpone = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchBtn = By.xpath("//input[@class='nav-input']");
}
