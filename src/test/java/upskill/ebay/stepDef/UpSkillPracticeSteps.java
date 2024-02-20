package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.UpSkillPracticeActions;

public class UpSkillPracticeSteps {
	
	UpSkillPracticeActions UpSkillPracticeActionsObj = new UpSkillPracticeActions();
	
	@Given("^Open UpSkill Automation page$")
	public void open_UpSkill_Automation_page() throws Throwable {
		UpSkillPracticeActionsObj.loadUpSkillPracticePage();
	}

	@When("^Switch to Practice iFrame$")
	public void switch_to_Practice_iFrame() throws Throwable {
		UpSkillPracticeActionsObj.switchPracticeIframe();
	}

	@Then("^User should able to write on Textbox$")
	public void user_should_able_to_write_on_Textbox() throws Throwable {
		UpSkillPracticeActionsObj.textboxType();
	}
	
	@When("^Click on Alert$")
	public void click_on_Alert() throws Throwable {
		UpSkillPracticeActionsObj.switchPracticeIframe();
		UpSkillPracticeActionsObj.clickAlert();
	}

	@Then("^Click on OK$")
	public void click_on_OK() throws Throwable {
		UpSkillPracticeActionsObj.clickOK();
	}
}