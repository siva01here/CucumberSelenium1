package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver hdriver;
	
	public HomePage(WebDriver rDriver) {
		hdriver=rDriver;
		PageFactory.initElements(hdriver, this);
	}
	
	@FindBy(xpath="//h1[@class='et_pb_module_header']//child::span")
	WebElement homePageText;
	
	public WebElement getHomePageTextElement() {
		return homePageText;
	}
	
	public String getTitle() {
		return hdriver.getTitle();
	}

}
