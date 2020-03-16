package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageElements.BigPageWithManyElements;
import pageElements.HomePage;

public class StepDefinitions {
	WebDriver driver;
	Logger logger;
	HomePage objhomePage;
	BigPageWithManyElements objBigPage;
	
	@Before
	public void init() {
		logger=Logger.getLogger("Cucumber_Selenium1");
		PropertyConfigurator.configure("D:\\EclipseProjects\\Cucumber_Selenium1\\log4j.properties");
		logger.setLevel(Level.INFO);
		
	}
	
	@After
	public void tearDown() {
		logger.info("Tear Down Method");
	}

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		logger.info("******************Launching the browser****************************");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win79\\chromedriver.exe");
		driver=new ChromeDriver();
		objhomePage= new HomePage(driver);
		
	}
	
	@When ("I navigate to automation practice home page")
	public void I_navigate_to_automation_practice_home_page() throws InterruptedException {
		logger.info("******************Navigating to the respective URL****************************");

		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/automation/");
	}
	
	@When("I navigate to home page of {string}")
	public void i_navigate_to_home_page_of(String url) {
		logger.info("******************Navigating to the respective URL****************************");

		driver.manage().window().maximize();
		driver.get(url);
	}
		
	@Then("Verify presence of automation practice text in home page")
	public void verify_presence_of_automation_practice_text_in_home_page() {
		logger.info("******************Verify presence of text in home page****************************");

		
		if(objhomePage.getHomePageTextElement().isDisplayed()) {
			System.out.println("Text present "+objhomePage.getHomePageTextElement().getText());
		}
		else {
			System.out.println("Text not present");
		}
	}
	
	@Then("Page Title should be {string}")
	public void page_Title_should_be(String expectedTitle) {
		logger.info("******************Verify the title****************************");

		String actualTitle=objhomePage.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is valid");
		}
		else {
			System.out.println("Invalid title "+actualTitle);	
		}
	}
	
	
	@Then("I close the browser")
	public void I_close_the_browser() {
		logger.info("******************Closing the browser****************************");

		driver.close();
	}

	//Steps of Big page with many elements
	@When("I click on Big page with many elements link")
	public void i_click_on_Big_page_with_many_elements_link() throws InterruptedException {
		logger.info("******************Accessing big page with many elements link****************************");

		objBigPage=new BigPageWithManyElements(driver);
	    objBigPage.clickOnBigPage();
	    Thread.sleep(3000);
	}

	@Then("Extract all section headers and verify its text")
	public void extract_all_section_headers_and_verify_its_text() {
		logger.info("******************Verify the sections header text****************************");

		Assert.assertEquals("Skills Improved:",objBigPage.getSkillsImprovedText());
		Assert.assertEquals("Section of Buttons", objBigPage.getSecOfButtonsHeaderText());
		Assert.assertEquals("Section of Social Media Follows", objBigPage.getSecOfSocialMediaHeaderText());
		Assert.assertEquals("Section of Random Stuff", objBigPage.getSectionOfRandomText());
		Assert.assertEquals("0 Comments", objBigPage.getCommentsHeaderText());
	    
	}
	
	
	
}
