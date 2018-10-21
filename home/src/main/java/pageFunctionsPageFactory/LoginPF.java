package pageFunctionsPageFactory;

import static org.testng.Assert.fail;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
import dataprovider.LogindataProvider;
import pageElementsPageFactory.LoginPE;
import ru.yandex.qatools.allure.annotations.Step;
 
public class LoginPF extends LoginPE{
	 
	public LoginPF(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	LogindataProvider dataProvider = new LogindataProvider();
	private static Logger logger = Logger.getLogger(LoginPF.class);
 
	@Step
	public void setUsername(String strUser) {
		try {
			logger.info("Sending username");
			userName.sendKeys(strUser);
		} catch (Exception e) {
			fail("Username", e);
		}
	}
 
	@Step
	public void setPass(String strPass) {
		try {
			logger.info("Sending password");
			password.clear();
			password.sendKeys(strPass);
		} catch (Exception e) {
			fail("unable to enter pass", e);
		}
	} 
	
	@Step
    public void clickLogin() throws InterruptedException {
		try {
			logger.info("clicking submit button");
			submit.click();
			Thread.sleep(10000);
		} catch (Exception e) {
			fail("unable to click login", e);
		}
	}
	
	@Step
    public void clickYourOrders() {
		try {
			logger.info("Click on your order button");
			Thread.sleep(5000);
			yourOrders.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
	  
	@Step
	public void LoginExcel() {
		try {
			String username = dataProvider.getUserDetails().get(0);
			String pass = dataProvider.getUserDetails().get(1);
			userName.sendKeys(username);
			submit.click();
			password.sendKeys(pass);
			submit.click();
			
		}catch(Exception e) {
			System.out.println("Unable to login :"+e);
		}
	}
}
