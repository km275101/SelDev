package pageFunctionsPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dataprovider.SearchProductdataProvider;
import pageElementsPageFactory.PdpPE;
import ru.yandex.qatools.allure.annotations.Step;


public class PdpPF extends PdpPE {
	
	
	
	public PdpPF(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	SearchProductdataProvider dataprovider = new SearchProductdataProvider();
	
	@Step
	public void enterProductName() {
		try {
			String productName = dataprovider.getProducts().get(0);
			System.out.println("Product to be searched :"+productName);
			searchBox.clear();
			searchBox.sendKeys(productName);
		}catch(Exception e) {
			System.out.println("Unable to Enter the name"+e);
		}
	}
	
	@Step
	public void clickSearchButton() {
		try {
			searchBtn.click();
		}catch(Exception e) {
			System.out.println("Unable to click"+e);
		}
	}
}
