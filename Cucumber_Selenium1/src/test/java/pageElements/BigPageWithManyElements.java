package pageElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BigPageWithManyElements {
	
	WebDriver ldriver;
	List<WebElement> sectionsHeader;
	
	public BigPageWithManyElements(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Big')]")
	WebElement bigPageLink;
	
	@FindBy(how=How.XPATH, using="//h2/span")
	WebElement skillsImprovedSection;
	
	@FindBy(how=How.CSS, using="span#Section_of_Buttons")
	WebElement sectionOfButtons;
	
	@FindBy(how=How.CSS, using="span#Section_of_Social_Media_Follows")
	WebElement sectionOfSocMedFol;
	
	@FindBy(how=How.CSS, using="span#Section_of_Random_Stuff")
	WebElement sectionOfRand;
	
	@FindBy(how=How.XPATH, using="//span[@id='0_Comments']")
	WebElement comments;
	
	public List getAllSections() {
		sectionsHeader= new ArrayList<WebElement>();
		sectionsHeader.add(skillsImprovedSection);
		sectionsHeader.add(sectionOfButtons);
		sectionsHeader.add(sectionOfSocMedFol);
		sectionsHeader.add(sectionOfRand);
		sectionsHeader.add(comments);
		
		return sectionsHeader;
	}
	
	
	public void clickOnBigPage() {
		bigPageLink.click();
	}
	
	public String getSkillsImprovedText() {
		return skillsImprovedSection.getText();
	}
	
	public String getSecOfButtonsHeaderText() {
		return sectionOfButtons.getText();
	}
	
	public String getSecOfSocialMediaHeaderText() {
		return sectionOfSocMedFol.getText();
	}
	
	public String getSectionOfRandomText() {
		return sectionOfRand.getText();
	}
	
	public String getCommentsHeaderText() {
		return comments.getText();
	}
	
	
	

}
