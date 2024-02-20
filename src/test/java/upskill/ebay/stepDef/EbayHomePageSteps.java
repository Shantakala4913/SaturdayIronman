package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsObj.searchItems(items);
	}
	
	@Given("^Search for Big Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomePageActionsObj.searchItems("Big & Tall Cotton Tee");
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomePageActionsObj.mouseHoverEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomePageActionsObj.clickSummary();
	}
}