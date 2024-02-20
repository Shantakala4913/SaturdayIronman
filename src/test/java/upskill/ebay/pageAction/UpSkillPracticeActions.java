package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.UpSkillPracticeLocators;
import upskill.utilities.SetupDrivers;

public class UpSkillPracticeActions {
	
	UpSkillPracticeLocators UpSkillPracticeLocatorsObj;
	
	public UpSkillPracticeActions(){
		UpSkillPracticeLocatorsObj = new UpSkillPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, UpSkillPracticeLocatorsObj);
	}
	
	public void loadUpSkillPracticePage() throws Exception{
		SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
		Thread.sleep(2000);	
	}
	
	public void switchPracticeIframe(){
		SetupDrivers.driver.switchTo().frame("htmlComp-iframe");
	}
	
	public void textboxType() throws Exception{
		UpSkillPracticeLocatorsObj.txtbxType.sendKeys("This is for Test");
		Thread.sleep(2000);
	}

	public void switchDynamicIframe() throws Exception{
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.tagName("iframe"));
		System.out.println("Number of Total iFrame : " + framelist.size());
		

			for(int i = 0; i<framelist.size(); i++){
				SetupDrivers.driver.switchTo().frame(i);
				
				try {
					UpSkillPracticeLocatorsObj.txtbxType.sendKeys("This is for Test");
				} catch (Exception e){
					System.out.println("Element not found in iframe");
				}
			}
			Thread.sleep(3000);
	}
	
	public void handleIframe(){
		
		//i find iframe using iframe tag in DOM or HTML
		//i use switchTo().frame() to switch iframes
		
		//Switch iframe by Index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		//Switch iframe by Name or ID
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		SetupDrivers.driver.switchTo().frame("parent");
		
		//nested iframe
		SetupDrivers.driver.switchTo().frame("inner");
		SetupDrivers.driver.switchTo().frame("child");
	}
	
	public void clickAlert() throws Exception{
		UpSkillPracticeLocatorsObj.btnAlert.click();
		Thread.sleep(3000);
	}
	
	public void clickOK() throws Exception{
		SetupDrivers.driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void handleAlert(){
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().sendKeys("Good service");
		SetupDrivers.driver.switchTo().alert().getText();
	}
}