package home;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.java.swing.plaf.windows.resources.windows;

public class LoginPage {
	
	

	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(5000);
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver", "E:\\iMp\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\iMp\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "E:\\iMp\\drivers\\IEDriverServer.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		String baseUrl = "https://www.amazon.in/";
		Thread.sleep(5000);
        //String expectedTitle = "";
        String actualTitle = "";
   
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		Thread.sleep(5000);
		actualTitle = driver.getTitle();
		System.out.println("Actual title is "+actualTitle);
		
		JavascriptExecutor jse;
		driver.findElement(By.xpath("//span[text()='Your Orders']/span")).click();
		System.out.println("clicked successsfull ");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("km275101@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kame9454");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 8");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,20)");
		driver.findElement(By.linkText("Apple iPhone 8 (Red, 64GB)")).click();
		
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
