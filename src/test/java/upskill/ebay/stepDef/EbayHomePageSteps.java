package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		//Opening ebay homepage in setupdriver class

	}
	
	@When("^Search for Shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
}
