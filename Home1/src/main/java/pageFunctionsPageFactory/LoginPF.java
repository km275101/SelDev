package pageFunctionsPageFactory;

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
	final static Logger log = Logger.getLogger(homeTest.LoginPF.class);

	@Step
	public void setUsername(String strUser) {
		log.info("Sending username");
		userName.sendKeys(strUser);
	}
 
	@Step
	public void setPass(String strPass) {
		log.info("Sending password");
		password.clear();
		password.sendKeys(strPass);
	}
	
	@Step
    public void clickLogin() throws InterruptedException {
		log.info("clicking submit button");
		submit.click();
		Thread.sleep(10000);
	}
	
	@Step
    public void clickYourOrders() {
		try {
			log.info("Click on your order button");
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
