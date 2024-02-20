package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpSkillPracticeLocators {
	
	//Type Text Box
	@FindBy(xpath="//input[contains(@placeholder, 'Type')]")
	public WebElement txtbxType;
	
	//Alert
	@FindBy(xpath="//button[contains(text(), 'Alert')]")
	public WebElement btnAlert;
	
}